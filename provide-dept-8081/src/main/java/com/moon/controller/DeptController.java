package com.moon.controller;

import com.moon.entity.Dept;
import com.moon.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @PostMapping("/dept/add")
    public boolean addDept(@RequestBody Dept dept) {
        return deptService.addDept(dept);
    }

    @HystrixCommand(fallbackMethod="hystrixQueryById")
    @GetMapping("/dept/get/{id}")
    public Dept queryById(@PathVariable Long id) {
        Dept dept = deptService.queryById(id);
        if(dept==null){
            throw new RuntimeException("数据不存在");
        }
        return dept;
    }

    @GetMapping("/dept/list")
    public List<Dept> queryAll() {
        return deptService.queryAll();
    }

    /**
     * 异常的时候的处理方案
     * @param id
     * @return
     */
    public Dept hystrixQueryById(@PathVariable Long id) {
        return new Dept().setDbSource("没有数据源").setName("数据不存在");

    }

}
