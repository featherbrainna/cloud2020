package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 王忠义
 * @version 1.0
 * @date: 2022/9/7 21:56
 */
@SpringBootApplication
@EnableEurekaClient
public class GateWayMain9527{
    public static void main(String[] args){
        SpringApplication.run(GateWayMain9527.class,args);
    }
}