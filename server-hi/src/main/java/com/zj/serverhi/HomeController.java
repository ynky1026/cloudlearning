package com.zj.serverhi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hi")
public class HomeController {

    @Value("${server.port}")
    String port;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(@RequestParam(value = "name")String name){
        return "hi " + name + " ,i am from port:" + port;
    }
}
