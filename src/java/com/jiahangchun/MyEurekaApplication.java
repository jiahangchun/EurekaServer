package com.jiahangchun;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;


@EnableEurekaServer
@SpringBootApplication
public class MyEurekaApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(MyEurekaApplication.class).web(true).run(args);
    }
}
