package com.honey.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpbitMarketService implements MarketService {


    @Autowired
    UpbitFeignClient upbitFeignClient;
    public double getCoinCurrentPrice(String coin) {
        return 123.2;
    }
}
