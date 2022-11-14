package com.binance.client.examples.trade;

import java.util.List;

import com.binance.client.RequestOptions;
import com.binance.client.SyncRequestClient;
import com.binance.client.examples.constants.PrivateConfig;
import com.binance.client.model.trade.WalletDeltaLog;

/**
 * @author : wangwanlu
 * @since : 2020/4/23, Thu
 **/
public class GetPositionMarginHistory {

    static int INCREASE_MARGIN_TYPE = 1;
    static int DECREASE_MARGIN_TYPE = 2;

    public static void main(String[] args) {
        RequestOptions options = new RequestOptions();
        SyncRequestClient syncRequestClient = SyncRequestClient.create(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY, options);

        long endTime = System.currentTimeMillis();
        long startTime = endTime - (24 * 60 * 60 * 1000);
        int limit = 500;
        List<WalletDeltaLog> list = syncRequestClient.getPositionMarginHistory("BTCUSDT", INCREASE_MARGIN_TYPE, startTime, endTime, limit); 
        System.out.println(list);//[Executing] -2014: API-key format invalid. !!!
    }
}
