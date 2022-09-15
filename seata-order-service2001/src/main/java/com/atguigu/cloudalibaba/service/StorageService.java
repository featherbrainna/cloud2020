package com.atguigu.cloudalibaba.service;

import com.atguigu.cloudalibaba.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 王忠义
 * @version 1.0
 * @date: 2022/9/15 23:58
 */
@FeignClient(value = "seata-storage-service")
public interface StorageService {

    @PostMapping(value = "/storage/decrease")
    CommonResult decrease(@RequestParam("productId")Long prouductId,@RequestParam("count")Integer count);
}
