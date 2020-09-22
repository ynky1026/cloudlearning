package com.zj.sericefeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "server-hi",fallback = FeignFallback.class)
public interface FeignInterface {

    @RequestMapping("/hi/home")
    String sayHiFromClient(@RequestParam(value = "name") String name);
}
