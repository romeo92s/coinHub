package com.honey.demo.view;

import com.honey.demo.dto.TransferCalculateDto;
import com.honey.demo.service.TransferCalculateService;
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


    //Dto > View
    public static TransferCalculateResponseView of(TransferCalculateDto dto) {
        return new TransferCalculateResponseView(
                dto.getCoin(),
                dto.getAmount(),
                dto.getBuyOrderBook(),
                dto.getSellOrderBook()
        );
    }

}
