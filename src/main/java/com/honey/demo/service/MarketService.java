package com.honey.demo.service;

import java.util.List;

public interface MarketService {

     double getCoinCurrentPrice(String coin);

     List<String> getCoins();


}
//Map<String, MarketService> marketService >> 키 밸류인 맵을 이용해서 스트링에 원하는 마켓이름이 들어가면 밸류인 마켓서비스의 인터페이스가 적용된다.