package com.binance.client.examples.trade;

import java.util.List;

import com.binance.client.RequestOptions;
import com.binance.client.SyncRequestClient;

import com.binance.client.examples.constants.PrivateConfig;
import com.binance.client.model.trade.Income;

public class GetIncomeHistory {
	public static void main(String[] args) {
		RequestOptions options = new RequestOptions();
		SyncRequestClient syncRequestClient = SyncRequestClient.create(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY, options);
		List<Income> incomeList = syncRequestClient.getIncomeHistory("BTCUSDT", null, null, null, null);
		System.out.println(incomeList);
	}
}