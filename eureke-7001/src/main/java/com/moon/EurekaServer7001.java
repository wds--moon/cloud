package com.moon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author wendongshan
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer7001 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7001.class, args);
    }

}
