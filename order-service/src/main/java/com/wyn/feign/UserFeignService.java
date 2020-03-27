package com.wyn.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "user-service",fallback = UserFeignServiceImp.class)
public interface UserFeignService {

    @RequestMapping("/user/getUserNameById")
    public String getUserNameById(@RequestParam("id") Integer id);
}


