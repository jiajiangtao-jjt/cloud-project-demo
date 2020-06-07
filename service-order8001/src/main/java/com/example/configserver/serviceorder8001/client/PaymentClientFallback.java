package com.example.configserver.serviceorder8001.client;

import com.example.configserver.cloudapicommons.entity.CommonResult;
import org.springframework.stereotype.Component;

@Component
public class PaymentClientFallback implements PaymentClient {
    @Override
    public String getPort() {
        return "getPortFallBack方法";
    }

    @Override
    public CommonResult getPaymentTimeOut() {
        return new CommonResult(400,"getPaymentTimeOutFallBackMethod");
    }
}
