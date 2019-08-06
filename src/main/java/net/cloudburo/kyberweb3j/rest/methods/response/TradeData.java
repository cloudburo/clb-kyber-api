package net.cloudburo.kyberweb3j.rest.methods.response;

import java.util.List;

public class TradeData extends KyberReponse<TradeData> {

    private List<TradeDataRecord> data;

    public List<TradeDataRecord> getData() {
        return data;
    }

    public void setData(List<TradeDataRecord> data) {
        this.data = data;
    }

    public static class TradeDataRecord extends EtherRecord {

        private boolean onlyOfficialReserve;

        public boolean isOnlyOfficialReserve() { return onlyOfficialReserve; }

        public void setOnlyOfficialReserve(boolean onlyOfficialReserve) { this.onlyOfficialReserve = onlyOfficialReserve; }
    }

}
