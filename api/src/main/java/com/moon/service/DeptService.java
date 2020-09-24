package com.moon.service;

import com.moon.entity.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Component
@FeignClient(value = "PROVIDE-DEPT",fallbackFactory = DeptServiceFallbackFactory.class)
public interface DeptService {

    @PostMapping("/dept/add")
    boolean addDept(Dept dept);

    /**
     * 接口参数必须规范化保持和Controller一致
     * @param deptNo
     * @return
     */
    @GetMapping("/dept/get/{deptNo}")
    Dept queryById(@PathVariable("deptNo") Long deptNo);

    @GetMapping("/dept/list")
    List<Dept> queryAll();
}
