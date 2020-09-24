package com.moon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author wendongshan
 */
@EnableEurekaClient
@SpringBootApplication
public class ConsumerDept8080 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerDept8080.class, args);
    }
}
