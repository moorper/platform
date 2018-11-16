package com.moorper.platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        // 设置时区
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));
        // 解决 tomcat 不支持 |{} 的问题
        System.setProperty("tomcat.util.http.parser.HttpParser.requestTargetAllow", "|{}");
        // run
        SpringApplication.run(Application.class, args);
    }
}
