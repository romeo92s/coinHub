package com.honey.demo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class CommonMarketService {

    private final Map<String, MarketService> marketServices;

    public double getPrice(String market, String coin) {
        MarketService marketService = getCommonCoins(marketServices, market);

        return marketService.getCoinCurrentPrice(coin);
    }

    public List<String> getCommonCoin(String fromMarket,String toMarket) {
        //마켓 서비스 가져오기
        MarketService fromMarketService = getMarketService(marketServices fromMarket);
        MarketService toMarketService = getMarketService(marketServices toMarket);
        //각 마켓의 거래가능 코인 불러오기

        //공통의 것 찾기

    }
    public static  MarketService getCommonCoins(Map<String, MarketService> marketServices,String market) {
        for(String key : marketServices.keySet()){
            if(key.substring(0,market.length()).equals(market.toLowerCase())){
                return  marketServices.get(key);
            }
        }
        return null;
    }
}
