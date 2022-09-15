package com.atguigu.cloudalibaba.service;

import com.atguigu.cloudalibaba.domain.Order;

/**
 * @author 王忠义
 * @version 1.0
 * @date: 2022/9/15 23:58
 */
public interface OrderService {
    /**
     * 创建订单
     */
    void create(Order order);
}
