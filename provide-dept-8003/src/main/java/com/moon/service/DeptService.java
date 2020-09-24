package com.moon.service;

import com.moon.entity.Dept;

import java.util.List;

public interface DeptService {

    boolean addDept(Dept dept);

    Dept queryById(Long deptNo);

    List<Dept> queryAll();
}
