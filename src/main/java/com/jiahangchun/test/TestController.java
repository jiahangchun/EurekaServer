package com.jiahangchun.test;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value="测试接口Controller")
public class TestController {
    @RequestMapping("/hello")
    public String home() {
        return "Hello world";
    }

}
