package com.moon.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author wendongshan
 */
@Data
@NoArgsConstructor
/**
 * 链式写法
 */
@Accessors(chain = true)
public class Dept  implements Serializable {
    private Long deptNo;
    private String name;
    private String dbSource;

    public Dept(String name) {
        this.name = name;
    }
}
