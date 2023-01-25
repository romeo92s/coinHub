package com.honey.demo.service;

import com.honey.demo.dto.CoinBuyDto;
import com.honey.demo.dto.CoinSellDto;
import com.honey.demo.dto.TransferCalculateDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class TransferCalculateService {

    private final CommonMarketService commonMarketService;

    private final Map<String, MarketService> marketServices;
    public TransferCalculateDto calculate(String fromMarket, String toMarket, double amount) {
//        List<String> commonCoins = commonMarketService.getCommonCoin(fromMarket, toMarket);
//
//        MarketService fromMarketService = CommonMarketService.getCommonCoins(marketServices, fromMarket);
//
//        MarketService toMarketService = CommonMarketService.getCommonCoins(marketServices, toMarket);
//
//        CoinBuyDto fromMarketBuyDto = fromMarketService.calculateBuy(commonCoins, amount);
//
//        Map<String, Double> fromMarketTransferFeeDto = fromMarketService.calculateFee(commonCoins, amount);
//
//        CoinSellDto toMarketSellDto = toMarketService.calculateSell(commonCoins, amount);
//
//        String transferCoin = toMarketSellDto.getAmounts().keySet().get(0); // TODO : 가장 많은 현금 코인 선택
//
//        return new TransferCalculateDto(
//                transferCoin,
//                toMarketSellDto.getAmounts().get(transferCoin),
//                fromMarketBuyDto.getOrderBooks().get(transferCoin),
//                toMarketSellDto.getOrderBooks().get(transferCoin)
//        );
        return null;
    }
}
