package com.atguigu.cloudalibaba.service.impl;

import com.atguigu.cloudalibaba.dao.OrderDao;
import com.atguigu.cloudalibaba.domain.Order;
import com.atguigu.cloudalibaba.service.AccountService;
import com.atguigu.cloudalibaba.service.OrderService;
import com.atguigu.cloudalibaba.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 王忠义
 * @version 1.0
 * @date: 2022/9/15 23:59
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;

    @Resource
    private StorageService storageService;

    @Resource
    private AccountService accountService;

    @Override
    public void create(Order order) {
        log.info("------>开始新建订单");
        orderDao.create(order);

        log.info("------>订单微服务开始调用库存，做扣减");
        storageService.decrease(order.getProductId(), order.getCount());
        log.info("------>订单微服务开始调用库存，做扣减end");
        //。。。
    }
}
