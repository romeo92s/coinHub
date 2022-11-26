package com.honey.demo.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "upbit", url = "")

public interface UpbitFeignClient {
}
