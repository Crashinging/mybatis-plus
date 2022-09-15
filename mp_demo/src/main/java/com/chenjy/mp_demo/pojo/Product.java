package com.chenjy.mp_demo.pojo;

import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;

/**
 * @Author: chenJY
 * @Description:
 * @Date: 2022-09-15 14:53
 */
@Data
public class Product {
    private Long id;
    private String name;
    private Integer price;
    @Version //标识乐观锁版本号字段
    private Integer version;
}
