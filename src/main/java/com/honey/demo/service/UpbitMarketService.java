package com.honey.demo.service;

import com.honey.demo.feign.UpbitFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpbitMarketService implements MarketService {


    @Autowired
    UpbitFeignClient upbitFeignClient;
    public double getCoinCurrentPrice(String coin) {
        return upbitFeignClient.getCoinPrice("KRW-" + coin.toUpperCase())
                .get(0).getTrade_price();
    }
}
