package com.chenjy.mp_demo;

import com.chenjy.mp_demo.mapper.UserMapper;
import com.chenjy.mp_demo.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class MpDemoApplicationTests {
    @Resource
    private UserMapper userMapper;

    /**
     * @Description 查询一个list集合，如果没有条件，就直接传参 null
    */
    @Test
    public void testGetAll() {
        List<User> users = userMapper.selectList(null);
    }

    @Test
    public void testInsert() {
        User user = new User();
        user.setName("李华");
        System.out.println("flag: " + userMapper.insert(user));
    }

    @Test
    public void testDelete() {
        userMapper.deleteById(1);
    }

    @Test
    public void testDeleteByMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "张三");
        map.put("id", 1);
        userMapper.deleteByMap(map);
    }

    @Test
    public void testDeleteBatchIds() {
        List<Long> list = Arrays.asList(2L, 3L);
        userMapper.deleteBatchIds(list);
    }



    @Test
    public void testSelect() {
        userMapper.selectById(4L);
    }

    @Test
    public void testSelectList() {
        userMapper.selectList(null);
    }

    @Test
    public void testSelectBatch() {
        List<Long> list = Arrays.asList(4L, 5L);
        userMapper.selectBatchIds(list);
    }

    @Test
    public void testSelectByMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("id", 4);
        map.put("name", "小明");
        userMapper.selectByMap(map);
    }

    @Test
    public void testSelectMapById() {
        Map<String, Object> map = userMapper.selectMapById(4L);
        System.out.println(map);
    }
}
