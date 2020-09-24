package com.moon.controller;

import com.moon.entity.Dept;
import com.moon.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;


    @PostMapping("/dept/add")
    public boolean addDept(@RequestBody Dept dept) {
        return deptService.addDept(dept);
    }

    @GetMapping("/dept/get/{deptNo}")
    public Dept queryById(@PathVariable Long deptNo) {
        return deptService.queryById(deptNo);
    }

    @GetMapping("/dept/list")
    public List<Dept> queryAll() {
        return deptService.queryAll();
    }
}
