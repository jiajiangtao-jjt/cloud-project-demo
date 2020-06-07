package com.example.configserver.serviceorder8001.client;

import com.example.configserver.cloudapicommons.entity.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(value = "PAYMENT-SERVICE",fallback = PaymentClientFallback.class)//指定调用哪个服务
public interface PaymentClient {

    @GetMapping("/payment/getPort")
    public String getPort();

    @GetMapping("/payment/paymentTimeOut")
    CommonResult getPaymentTimeOut();
}
