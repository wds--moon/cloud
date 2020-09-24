package com.moon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author wendongshan
 * Feign 默认继承了 ribbon
 */
@EnableFeignClients(basePackages = {"com.moon.service"})
@ComponentScan("com.moon")
@EnableEurekaClient
@SpringBootApplication
public class ConsumerDept8888 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerDept8888.class, args);
    }
}
