package net.cloudburo.kyberweb3j.rest.methods.response;

import net.cloudburo.kyberweb3j.rest.methods.request.Rates;

import java.util.List;

public class BuyRate extends KyberReponse<BuyRate> {

    private List<Rates> data;
    public List<Rates> getData() {
        return data;
    }
    public void setData(List<Rates> data) {
        this.data = data;
    }

}
