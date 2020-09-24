package com.moon.service;

import com.moon.entity.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 降级
 */
@Component
public class DeptServiceFallbackFactory  implements FallbackFactory {


    @Override
    public DeptService create(Throwable throwable) {

        return new DeptService() {
            @Override
            public boolean addDept(Dept dept) {
                return false;
            }

            @Override
            public Dept queryById(Long deptNo) {
                return new Dept().setName("服务降级操作,当前服务以及被关闭!");
            }

            @Override
            public List<Dept> queryAll() {
                return null;
            }
        };
    }
}
