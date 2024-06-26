package com.binance.client.examples.trade;

import java.util.List;

import com.binance.client.RequestOptions;
import com.binance.client.SyncRequestClient;

import com.binance.client.examples.constants.PrivateConfig;
import com.binance.client.model.trade.PositionRisk;

public class GetPositionRisk {
	public static void main(String[] args) {
		RequestOptions options = new RequestOptions();
		SyncRequestClient syncRequestClient = SyncRequestClient.create(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY, options);
		List<PositionRisk> positionRiskList = syncRequestClient.getPositionRisk("btcusdt");
		System.out.println(positionRiskList);
	}
}
