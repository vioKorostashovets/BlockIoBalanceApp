package ua.org.violettak;

import ua.org.violettak.helpers.BalanceRecordHelper;
import ua.org.violettak.pojo.BalanceRecord;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import static ua.org.violettak.helpers.RestAPIHelper.getStringResponse;
import static ua.org.violettak.helpers.WriteToCSVUtil.createBalanceCSVFile;

public class Main {

    private static boolean nonEmptyWallet = false;
    private static String apiKey;

    public static void main(String[] args) throws Exception {
        System.getProperties().load(ClassLoader.getSystemResourceAsStream("application.properties"));
        String baseUrl = System.getProperty("url");
        String balanceEndpoint = System.getProperty("endpoint");
        String pageNumber = System.getProperty("page");

        setApiKeyFromConsole();
        setNotEmptyWalletProp();

        List<BalanceRecord> records = new BalanceRecordHelper()
                .getBalanceRecords(getStringResponse(baseUrl,balanceEndpoint,apiKey,pageNumber),nonEmptyWallet);

        createBalanceCSVFile(records);
        System.out.println("You can find balance.csv in a root project directory");
        TimeUnit.SECONDS.sleep(5);
    }

    private static void setApiKeyFromConsole() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input API key for Bitcoin (TESTNET!):");
        apiKey = sc.next();
    }

    private static void setNotEmptyWalletProp(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Input Y if only none zero wallet should be written in CSV file");
        String nonEmpty = sc.next();
        if(nonEmpty.equalsIgnoreCase("y")){
            nonEmptyWallet = true;
        }
    }
}

