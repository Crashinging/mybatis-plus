package com.chenjy.mp_demo1.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Author: chenJY
 * @Description:
 * @Date: 2022-09-15 17:32
 */
@Data
@TableName("mp_product")
public class Product {
    private Integer id;
    private String name;
    private Integer price;
    private Integer version;
}
