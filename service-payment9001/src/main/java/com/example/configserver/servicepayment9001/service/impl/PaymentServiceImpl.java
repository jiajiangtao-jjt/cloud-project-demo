package com.example.configserver.servicepayment9001.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.configserver.cloudapicommons.entity.Payment;
import com.example.configserver.servicepayment9001.mapper.PaymentMapper;
import com.example.configserver.servicepayment9001.service.PaymentService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl extends ServiceImpl<PaymentMapper, Payment> implements PaymentService {

    @Resource
    PaymentMapper paymentMapper;


}
