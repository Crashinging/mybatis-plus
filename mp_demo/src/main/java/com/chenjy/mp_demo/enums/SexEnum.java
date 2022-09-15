package com.chenjy.mp_demo.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.Getter;

/**
 * @Author: chenJY
 * @Description:
 * @Date: 2022-09-15 15:39
 */
@Getter
public enum SexEnum {
    MALE(1, "男"),
    FEMALE(0, "女");

    @EnumValue // 将注解所标识的值存储到数据库中
    private Integer sex;
    private String sexName;

    SexEnum(Integer sex, String sexName) {
        this.sex = sex;
        this.sexName = sexName;
    }
}
