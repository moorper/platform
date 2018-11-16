package com.moorper.platform.controller;

import com.moorper.platform.utils.RequestUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private RequestUtil requestUtil;

    @ApiOperation(value = "本机 IP")
    @RequestMapping(value = "/ip", method = RequestMethod.GET)
    public String ip() {
        return requestUtil.getIpAddr();
    }
}
