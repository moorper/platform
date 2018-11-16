package com.moorper.platform.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @ApiOperation(value = "首页请求")
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "com.moorper.platform";
    }

    @ApiOperation(value = "ping 一下服务器")
    @RequestMapping(value = "/ping", method = RequestMethod.GET)
    public String ping() {
        return "pong";
    }
}
