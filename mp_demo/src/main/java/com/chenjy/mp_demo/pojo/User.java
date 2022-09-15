package com.chenjy.mp_demo.pojo;

import com.baomidou.mybatisplus.annotation.*;
import com.chenjy.mp_demo.enums.SexEnum;
import lombok.Data;

/**
 * @Author: chenJY
 * @Description:
 * @Date: 2022-09-14 9:28
 */
@Data
// @TableName("mp_user")
public class User {
    @TableId(value = "uid")
    private Long id;
    @TableField("user_name")
    private String name;
    private Integer age;
    private String email;
    @TableLogic(value = "1", delval = "0")
    private Integer status;
    private SexEnum sex;// 枚举sex字段
}
