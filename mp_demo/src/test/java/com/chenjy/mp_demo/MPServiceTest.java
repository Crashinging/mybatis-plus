package com.chenjy.mp_demo;

import com.chenjy.mp_demo.pojo.User;
import com.chenjy.mp_demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: chenJY
 * @Description:
 * @Date: 2022-09-14 20:37
 */
@SpringBootTest
public class MPServiceTest {

    @Resource
    private UserService userService;

    @Test
    public void testGetCount() {
        userService.count();
    }

    @Test
    public void testInsertBatch() {
        ArrayList<User> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setName("鲁班" + i + "号");
            user.setAge(9 + i);
            users.add(user);
        }
        userService.saveBatch(users);
    }
}
