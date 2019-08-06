package net.cloudburo.kyberweb3j.rest.protocol;

import net.cloudburo.kyberweb3j.rest.methods.request.GasPriceRange;
import net.cloudburo.kyberweb3j.rest.methods.request.SingleRate;
import net.cloudburo.kyber.tutorial.methods.response.*;
import net.cloudburo.kyberweb3j.methods.response.*;
import net.cloudburo.kyberweb3j.rest.methods.response.*;
import org.web3j.protocol.core.Request;

import java.math.BigInteger;

public interface KyberAPI {

    public Request<?, Currencies> currencies();
    public Request<?, BuyRate> buyRate(String id, String qty, boolean onlyOfficialReserve);
    public Request<?, SellRate> sellRate(String id, String qty, boolean onlyOfficialReserve);
    public Request<?, TradeData> tradeData(String userAddress, SingleRate rate, GasPriceRange gasPrice);
    public Request<?, TradeData> tradeData(String userAddress, SingleRate rate, GasPriceRange gasPrice, BigInteger nonce);
    public Request<?, TradeData> tradeData(String userAddress, String srcId, String dstId, Float srcQty, Float minDstQty,
                                           GasPriceRange gasPrice, String walletId, boolean onlyOfficialReserve);
    public Request<?, EnabledTokensForWallet> enabledTokensForWallet(String userAddress);
    public Request<?, EnableTokenTransfer> enableTokenTransfer(String userAddress, String id, GasPriceRange gasPrice);
}
