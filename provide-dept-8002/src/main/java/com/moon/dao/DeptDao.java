package com.moon.dao;

import com.moon.entity.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DeptDao {

    boolean addDept(Dept dept);

    Dept queryById(Long deptNo);

    List<Dept> queryAll();
}
