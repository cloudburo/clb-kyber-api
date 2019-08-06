package net.cloudburo.kyberweb3j.rest.methods.response;

public class EnableTokenTransfer extends KyberReponse<EnableTokenTransfer>{

    public EtherRecord getData() {
        return data;
    }

    public void setData(EtherRecord data) {
        this.data = data;
    }

    public EtherRecord data;


}
