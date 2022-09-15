package com.atguigu.cloudalibaba.service;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @author 王忠义
 * @version 1.0
 * @date: 2022/9/14 22:44
 */
@Component
public class PaymentFallbackService implements PaymentService{
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444,"服务降级返回，---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
