package ua.org.violettak.pojo;

public class RootJsonData {
    private String status;
    private AddressesGeneralData data;

    public RootJsonData(String status, AddressesGeneralData data) {
        this.status = status;
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public AddressesGeneralData getData() {
        return data;
    }

}
