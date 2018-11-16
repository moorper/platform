package com.moorper.platform.controller;

import com.moorper.platform.utils.RequestUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Autowired
    private RequestUtil requestUtil;

    @RequestMapping("/")
    public String index() {
        return "com.moorper.platform";
    }

    @RequestMapping("/ping")
    public String ping() {
        return "pong";
    }

    @RequestMapping("/client/ip")
    public String ip() {
        return requestUtil.getIpAddr();
    }
}
