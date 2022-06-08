package ua.org.violettak.pojo;

public class Address {
    private Integer user_id;
    private String address;
    private String label;
    private String pending_received_balance;
    private String available_balance;
    private Boolean is_segwit;

    public Address(Integer user_id, String address, String label, String pending_received_balance, String available_balance, Boolean is_segwit) {
        this.user_id = user_id;
        this.address = address;
        this.label = label;
        this.pending_received_balance = pending_received_balance;
        this.available_balance = available_balance;
        this.is_segwit = is_segwit;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public String getAddress() {
        return address;
    }

    public String getLabel() {
        return label;
    }

    public String getPending_received_balance() {
        return pending_received_balance;
    }

    public String getAvailable_balance() {
        return available_balance;
    }

    public Boolean getIs_segwit() {
        return is_segwit;
    }
}
