package com.moon.configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBeanUtil {

    @LoadBalanced
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    /**
     * 自定义路由是算法,也可以自定义,当前使用随机
     * 注意自定义只能房放在自己的包路径下,不能与application同级
     * @return
     */
    @Bean
    public IRule getRandom(){
        return  new RandomRule();
    }
}
