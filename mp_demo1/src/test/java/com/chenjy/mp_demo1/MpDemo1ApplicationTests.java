package com.chenjy.mp_demo1;

import com.chenjy.mp_demo1.pojo.Product;
import com.chenjy.mp_demo1.service.ProductService;
import com.chenjy.mp_demo1.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class MpDemo1ApplicationTests {
    @Resource
    private UserService userService;
    @Resource
    private ProductService productService;

    @Test
    public void testSelect() {
        System.out.println(userService.getById(1));
        System.out.println(productService.getById(1));
    }
}
