package com.example.configserver.serviceorder8001.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.configserver.cloudapicommons.entity.Orders;
import org.springframework.web.bind.annotation.PathVariable;

public interface OrdersService extends IService<Orders> {

    public String paymentCircuitBreaker(@PathVariable("id") Integer id);
}
