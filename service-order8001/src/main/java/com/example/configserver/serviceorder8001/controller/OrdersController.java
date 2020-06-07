package com.example.configserver.serviceorder8001.controller;

import com.example.configserver.cloudapicommons.entity.CommonResult;
import com.example.configserver.serviceorder8001.client.PaymentClient;
import com.example.configserver.serviceorder8001.service.OrdersService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/orders")
//@DefaultProperties(defaultFallback = "payment_Global_FallbackMethod")
public class OrdersController {

    @Value("${server.port}")
    private String port;

    @Autowired
    private OrdersService ordersService;

    @Autowired
    private PaymentClient paymentClient;

    @GetMapping("/getOrdersResult")
    @HystrixCommand
    public CommonResult getOrdersResult(){
        String result = paymentClient.getPort();
        int n = 1/0;
        return new CommonResult(200,"查询成功",result);
    }

    @GetMapping("/getPort")
    @HystrixCommand(fallbackMethod = "getPortFallBack")
    public CommonResult getPort(){
        int n = 1/0;
        return new CommonResult(200,"成功",port);
    }

    @GetMapping("/paymentTimeOut")
//    @HystrixCommand(fallbackMethod = "paymentTimeOut_fallBack",commandProperties = {
// 设置这个线程的超时时间是3s，3s内是正常的业务逻辑，超过3s调用fallbackMethod指定的方法进行处理
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000")
//    })
    @HystrixCommand
    public CommonResult paymentTimeOut(){
        return paymentClient.getPaymentTimeOut();
    }


    @GetMapping("/breaker/{id}")
    public String paymentCircuitBreaker(@PathVariable("id") Integer id){
        return ordersService.paymentCircuitBreaker(id);
    }






    public CommonResult paymentTimeOut_fallBack(){
        return new CommonResult(400,"订单消费8008端口支付超时降级处理");
    }


    public CommonResult getPortFallBack(){
        return new CommonResult(400,"订单消费8008端口降级处理");
    }

    /**
     * 全局fallback方法
     * @return
     */
    public CommonResult payment_Global_FallbackMethod(){
        return new CommonResult(400,"Global异常处理信息，请稍后再试。/(╥﹏╥)/~~");
    }

}
