package com.moon.controller;

import com.moon.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private RestTemplate restTemplate;

    private final static String BASE_URL = "http://PROVIDE-DEPT/";

    @PostMapping("/dept/add")
    public boolean addDept(@RequestBody Dept dept) {
        return restTemplate.postForObject(BASE_URL + "dept/add", dept, boolean.class);
    }

    @GetMapping("/dept/get/{id}")
    public Dept queryById(@PathVariable Long id) {
        return restTemplate.getForObject(BASE_URL + "dept/get/" + id, Dept.class);
    }

    @GetMapping("/dept/list")
    public List<Dept> queryAll() {
        return restTemplate.getForObject(BASE_URL + "dept/list", List.class);
    }
}
