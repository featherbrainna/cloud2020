package com.atguigu.cloudalibaba.dao;

import com.atguigu.cloudalibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author 王忠义
 * @version 1.0
 * @date: 2022/9/15 23:35
 */
@Mapper
public interface OrderDao {
    //1 创建订单
    void create(Order order);

    //2 修改订单状态，从0改为1
    void update(@Param("userId")Long userId,@Param("status")Integer status);
}
