package ua.org.violettak.pojo;

import java.util.List;

public class BalanceRecord {
    private String currency;
    private String address;
    private String balance;
    private List<BalanceRecord> printRecordList;

    public BalanceRecord(String currency, String address, String balance) {
        this.currency = currency;
        this.address = address;
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public void setPrintRecordList(List<BalanceRecord> printRecordList) {
        this.printRecordList = printRecordList;
    }

    public List<BalanceRecord> getPrintRecordList() {
        return printRecordList;
    }

    @Override
    public String toString() {
        return currency + ", " + address + ", " + balance + ", " + "\n";
    }
}
