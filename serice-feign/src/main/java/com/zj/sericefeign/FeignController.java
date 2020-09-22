package com.zj.sericefeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    FeignInterface feign;

    @RequestMapping("/hi")
    public String hi(@RequestParam String name) {
        return feign.sayHiFromClient(name);
    }
}
