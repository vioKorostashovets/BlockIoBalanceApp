package ua.org.violettak.helpers;

import ua.org.violettak.pojo.BalanceRecord;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class WriteToCSVUtil {

    public static void createBalanceCSVFile(List<BalanceRecord> recordList) {
        try (PrintWriter writer = new PrintWriter(new File("balance.csv"))) {
            writer.append("currency, address, balance \n");
            recordList.forEach(record -> writer.write(record.toString()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}







