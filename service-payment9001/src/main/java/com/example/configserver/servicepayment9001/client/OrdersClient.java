package com.example.configserver.servicepayment9001.client;

import com.example.configserver.cloudapicommons.entity.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient("ORDER-SERVICE")
public interface OrdersClient {

    @GetMapping("/orders/getPort")
    public CommonResult getPort();
}
