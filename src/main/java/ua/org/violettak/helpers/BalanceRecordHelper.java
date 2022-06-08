package ua.org.violettak.helpers;

import com.google.gson.Gson;
import ua.org.violettak.pojo.Address;
import ua.org.violettak.pojo.AddressesGeneralData;
import ua.org.violettak.pojo.BalanceRecord;
import ua.org.violettak.pojo.RootJsonData;

import java.util.List;
import java.util.stream.Collectors;

public class BalanceRecordHelper {
    private AddressesGeneralData generalData;
    private List<Address> addresses;
    private String currency;

    private void getDataFromResponse(String responseResult, Boolean notEmptyWallets) {
        generalData = new Gson().fromJson(responseResult, RootJsonData.class).getData();
        currency = generalData.getNetwork();
        if(notEmptyWallets){
            addresses = generalData
                    .getAddresses()
                    .stream()
                    .filter(address -> !address.getAvailable_balance().equals("0.00000000"))
                    .collect(Collectors.toList());
        }else{
            addresses = generalData.getAddresses();
        }
    }

    public List<BalanceRecord> getBalanceRecords(String responseResult, Boolean notEmptyWallets) {
        getDataFromResponse(responseResult,notEmptyWallets);
        return addresses
                .stream()
                .map(address -> new BalanceRecord(currency, address.getAddress(), address.getAvailable_balance()))
                .collect(Collectors.toList());
    }
}
