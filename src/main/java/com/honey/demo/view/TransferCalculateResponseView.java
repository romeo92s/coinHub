package com.honey.demo.view;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Getter
@AllArgsConstructor
public class TransferCalculateResponseView {

    private String coin;
    private double amount;
    private Map<Double, Double> buyOrderBook;
    private Map<Double, Double> sellOrderBook;

}
