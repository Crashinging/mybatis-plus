package com.chenjy.mp_demo;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.chenjy.mp_demo.mapper.ProductMapper;
import com.chenjy.mp_demo.mapper.UserMapper;
import com.chenjy.mp_demo.pojo.Product;
import com.chenjy.mp_demo.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @Author: chenJY
 * @Description:
 * @Date: 2022-09-15 10:51
 */
@SpringBootTest
public class MPPluginsTest {
    @Resource
    private UserMapper userMapper;

    @Test
    public void testPage() {
        Page<User> page = new Page<>(1, 5);
        userMapper.selectPage(page, null);
        System.out.println(page.getRecords());
        System.out.println(page.getPages());
        System.out.println(page.hasPrevious());
    }

    @Test
    public void testPagePo(){
        Page<User> page = new Page<>(1, 5);
        userMapper.selectPagePo(page, 15);
        System.out.println(page.getRecords());
    }

    @Resource
    private ProductMapper productMapper;

    @Test
    public void testProduct_01() {
        //小李查询商品价格
        Product productLi = productMapper.selectById(1);
        System.out.println("小李查询的商品价格："+productLi.getPrice());
        //小王查询商品价格
        Product productWang = productMapper.selectById(1);
        System.out.println("小王查询的商品价格："+productWang.getPrice());
        //小李将商品价格+50
        productLi.setPrice(productLi.getPrice()+50);
        productMapper.updateById(productLi);
        //小王将商品价格-30
        productWang.setPrice(productWang.getPrice()-30);
        int result = productMapper.updateById(productWang);
        if(result == 0){
            /*
                操作失败，重试
                    即之前版本号已被修改，现在重新获取一个版本号，再来修改
             */
            Product productNew = productMapper.selectById(1);
            productNew.setPrice(productNew.getPrice()-30);
            productMapper.updateById(productNew);
        }
        //老板查询商品价格
        Product productLaoban = productMapper.selectById(1);
        System.out.println("老板查询的商品价格："+productLaoban.getPrice());
    }
}
