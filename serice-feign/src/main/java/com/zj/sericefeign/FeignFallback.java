package com.zj.sericefeign;

import org.springframework.stereotype.Component;

@Component
public class FeignFallback implements FeignInterface {
    @Override
    public String sayHiFromClient(String name) {
        return "sorry "+name;
    }
}
