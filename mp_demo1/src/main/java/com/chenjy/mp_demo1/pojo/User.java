package com.chenjy.mp_demo1.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Author: chenJY
 * @Description:
 * @Date: 2022-09-15 17:30
 */
@Data
public class User {
    private Integer id;
    private String name;
    private Integer age;
    private String email;
}
