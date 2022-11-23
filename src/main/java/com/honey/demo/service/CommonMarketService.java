package com.honey.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CommonMarketService {

    MarketService marketService;
    @Autowired
    Map<String, MarketService> marketServices;

    public double getPrice(String market, String coin) {

        for(String key : marketServices.keySet()){
            if(key.substring(0,market.length()).equals(market.toLowerCase())){
                marketService = marketServices.get(key);
                break;
            }
        }
        return marketService.getCoinCurrentPrice(coin);

    }
}
