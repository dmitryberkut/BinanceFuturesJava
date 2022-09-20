package com.binance.client.examples.trade;

import java.util.List;

import com.binance.client.RequestOptions;
import com.binance.client.SyncRequestClient;

import com.binance.client.examples.constants.PrivateConfig;
import com.binance.client.model.trade.Order;

public class GetOpenOrders {
	public static void main(String[] args) {
		RequestOptions options = new RequestOptions();
		SyncRequestClient syncRequestClient = SyncRequestClient.create(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY, options);
		//List<Order> orders = syncRequestClient.getOpenOrders("BTCUSDT");
		List<Order> orders = syncRequestClient.getOpenOrders("BTCUSDT");
		System.out.println(orders);
		// System.out.println(syncRequestClient.getOpenOrders(null));
	}
}