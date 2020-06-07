package com.example.configserver.servicepayment9001.controller;

import com.example.configserver.cloudapicommons.entity.CommonResult;
import com.example.configserver.servicepayment9001.client.OrdersClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {

    @Value("${server.port}")
    private String port;

    @Autowired
    OrdersClient ordersClient;

    @GetMapping("/getPort")
    public String getPort(){
        log.info("prot:{}",port);
        return port;
    }

    @GetMapping("/getOrdersPort")
    public CommonResult getOrdersPort(){
        return ordersClient.getPort();
    }


    @GetMapping("/paymentTimeOut")
    public CommonResult getPaymentTimeOut(){
//        try {
//            Thread.sleep(3000);
//            int n = 3/0;
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        int n = 3/0;
        return new CommonResult(200,"支付成功");
    }

}
