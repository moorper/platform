package com.moorper.platform.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "/random", description = "获取指定规则的随机字符")
@RestController
@RequestMapping("/random")
public class RandomController {
    @ApiOperation(value = "获取一个随机密码")
    @ApiImplicitParam(name = "length", defaultValue = "8")
    @RequestMapping(value = "/password", method = RequestMethod.GET)
    public String password(@RequestParam(name = "length", defaultValue = "8") Integer length) {
        String[] upperCaseLetter = new String[]{
                "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
        };
        String[] lowerCaseLetter = new String[]{
                "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"
        };
        String[] digital = new String[]{
                "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"
        };
        String[] symbol = new String[]{
                "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "_", "+", "-", "="
        };
        StringBuilder password = new StringBuilder();
        long type;
        long index;
        for (int i = 0; i < length; i++) {
            type = Math.round((Math.random() * 3) + 1);
            switch (String.valueOf(type)) {
                case "1":
                    index = Math.round(Math.random() * (upperCaseLetter.length - 1));
                    password.append(upperCaseLetter[(int) index]);
                    break;
                case "2":
                    index = Math.round(Math.random() * (lowerCaseLetter.length - 1));
                    password.append(lowerCaseLetter[(int) index]);
                    break;
                case "3":
                    index = Math.round(Math.random() * (digital.length - 1));
                    password.append(digital[(int) index]);
                    break;
                case "4":
                    index = Math.round(Math.random() * (symbol.length - 1));
                    password.append(symbol[(int) index]);
                    break;
            }
        }
        return password.toString();
    }
}
