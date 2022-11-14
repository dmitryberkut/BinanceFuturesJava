package com.binance.client.examples.market;

import java.util.List;

import com.binance.client.RequestOptions;
import com.binance.client.SyncRequestClient;

import com.binance.client.examples.constants.PrivateConfig;
import com.binance.client.model.market.MarkPrice;

public class GetMarkPrice {
	public static void main(String[] args) {
		RequestOptions options = new RequestOptions();
		SyncRequestClient syncRequestClient = SyncRequestClient.create(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY, options);
		List<MarkPrice> markPriceList = syncRequestClient.getMarkPrice("BTCUSDT");
		System.out.println(markPriceList);
	}
}
