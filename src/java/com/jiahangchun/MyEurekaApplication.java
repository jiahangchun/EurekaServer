package com.jiahangchun;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class MyEurekaApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(MyEurekaApplication.class).web(true).run(args);
    }
}
