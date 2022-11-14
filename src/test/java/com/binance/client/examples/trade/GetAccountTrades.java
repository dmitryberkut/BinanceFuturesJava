package com.binance.client.examples.trade;

import java.util.List;

import com.binance.client.RequestOptions;
import com.binance.client.SyncRequestClient;

import com.binance.client.examples.constants.PrivateConfig;
import com.binance.client.model.trade.MyTrade;

public class GetAccountTrades {
	public static void main(String[] args) {
		RequestOptions options = new RequestOptions();
		SyncRequestClient syncRequestClient = SyncRequestClient.create(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY, options);
		List<MyTrade> myTradeList = syncRequestClient.getAccountTrades("BTCUSDT", null, null, null, null);
		System.out.println(myTradeList);
	}
}