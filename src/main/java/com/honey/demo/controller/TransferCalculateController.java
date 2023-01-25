package com.honey.demo.controller;

import com.honey.demo.service.TransferCalculateService;
import com.honey.demo.view.TransferCalculateResponseView;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor //꼭필요한 생성자만 생성
public class TransferCalculateController {

    private final TransferCalculateService transferCalculateService;

    @GetMapping("/transfer-calculate")
    public TransferCalculateResponseView getPrice(
            @RequestParam String fromMarket,
            @RequestParam String toMarket,
            @RequestParam double amount){

        return new TransferCalculateResponseView("BTC", 123.45,
                Map.of(123D, 456D),
                Map.of(123D, 456D));
//        return TransferCalculateResponseView.of(
//                transferCalculateService.calculate(fromMarket, toMarket,amount)
//        );

    }


}
