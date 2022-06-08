package ua.org.violettak.pojo;

import java.util.List;

public class AddressesGeneralData {
    private String network;
    private List<Address> addresses;
    private Integer page;
    private Boolean hasMore;

    public AddressesGeneralData(String network, List<Address> addresses, Integer page, Boolean hasMore) {
        this.network = network;
        this.addresses = addresses;
        this.page = page;
        this.hasMore = hasMore;
    }

    public String getNetwork() {
        return network;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public Integer getPage() {
        return page;
    }

    public Boolean getHasMore() {
        return hasMore;
    }
}

