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
@RequiredArgsConstructor
public class TransferCalculateController {

    @Autowired
    private final TransferCalculateService transferCalculateService;

    @GetMapping("/transfer-calculate")
    public TransferCalculateResponseView getPrice(
            @RequestParam String fromMarket,
            @RequestParam String toMarket,
            @RequestParam double amount){
        return TransferCalculateResponseView.of(
                transferCalculateService.calculate(fromMarket, toMarket, amount));

    }


}
