package com.binance.client.examples.market;

import com.binance.client.model.enums.CandlestickInterval;
import com.binance.client.model.market.Candlestick;

import java.util.List;

import com.binance.client.RequestOptions;
import com.binance.client.SyncRequestClient;

import com.binance.client.examples.constants.PrivateConfig;

public class GetCandlestick {
	public static void main(String[] args) {
		RequestOptions options = new RequestOptions();
		SyncRequestClient syncRequestClient = SyncRequestClient.create(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY, options);
		List<Candlestick> candlestickList = syncRequestClient.getCandlestick("BTCUSDT", CandlestickInterval.ONE_MINUTE, null, null, 50);
		System.out.println(candlestickList);
	}
}
