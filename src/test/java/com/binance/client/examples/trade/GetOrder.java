package com.binance.client.examples.trade;

import com.binance.client.RequestOptions;
import com.binance.client.SyncRequestClient;

import com.binance.client.examples.constants.PrivateConfig;
import com.binance.client.model.trade.Order;

public class GetOrder {
	public static void main(String[] args) {
		RequestOptions options = new RequestOptions();
		SyncRequestClient syncRequestClient = SyncRequestClient.create(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY, options);
		//Order order = syncRequestClient.getOrder("BTCUSDT", 77138538374L, null);
		Order order = syncRequestClient.getOpenOrder("BTCUSDT", 77203412609L, null);
		System.out.println(order);
	}
}