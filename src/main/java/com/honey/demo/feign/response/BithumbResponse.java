package com.honey.demo.feign.response;

import lombok.Getter;

@Getter
public class BithumbResponse<T> {
    private String status;
    private T data;
    //<T> << 제네릭
}
