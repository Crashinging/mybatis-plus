package com.chenjy.mp_demo;

import com.chenjy.mp_demo.enums.SexEnum;
import com.chenjy.mp_demo.mapper.UserMapper;
import com.chenjy.mp_demo.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @Author: chenJY
 * @Description:
 * @Date: 2022-09-15 15:50
 */
@SpringBootTest
public class MPEnumTest {
    @Resource
    private UserMapper userMapper;

    @Test
    public void testEnum() {
        User user = new User();
        user.setSex(SexEnum.MALE);
        user.setName("王重阳");
        user.setAge(39);
        userMapper.insert(user);
    }
}
