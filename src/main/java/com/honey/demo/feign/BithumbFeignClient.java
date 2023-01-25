package com.honey.demo.feign;

import com.honey.demo.feign.response.BithumbResponse;
import com.honey.demo.model.BithumbAssetEachStatus;
import com.honey.demo.model.BithumbCoinPrice;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@FeignClient(name = "Bithumb", url="https://api.bithumb.com/public")
public interface BithumbFeignClient {

    @GetMapping("/ticker/{coin}")
    BithumbResponse<BithumbCoinPrice> getCoinPrice(@PathVariable("coin") String coin);
    @GetMapping("/assetstatus/ALL")
    BithumbResponse<Map<String, BithumbAssetEachStatus>> getAssetStatus();

    // /짝때기 안에 들어가있으면 path파라미터 ?밖에있으면  request파라미터(쿼리파라미터)
    //[] << list형태 , { "status": "data": 일경우 BithumbResponse 클래스를 만들어 }
}
