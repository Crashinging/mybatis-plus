package com.chenjy.mp_demo1.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chenjy.mp_demo1.mapper.ProductMapper;
import com.chenjy.mp_demo1.pojo.Product;
import com.chenjy.mp_demo1.service.ProductService;
import org.springframework.stereotype.Service;

/**
 * @Author: chenJY
 * @Description:
 * @Date: 2022-09-15 17:38
 */
@Service
@DS("slave_1")// 设置要操作的数据源
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {
}
