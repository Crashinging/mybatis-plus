package com.chenjy.mp_demo;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.chenjy.mp_demo.mapper.UserMapper;
import com.chenjy.mp_demo.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @Author: chenJY
 * @Description:
 * @Date: 2022-09-15 7:56
 */
@SpringBootTest
public class MPMapperTest {
    @Resource
    private UserMapper userMapper;

    @Test
    public void test_01() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        // user_name模糊查询，age在13到20之间，email不为空
        queryWrapper.like("user_name", "张")
                .between("age", 13, 17)
                .isNotNull("email");
        List<User> list = userMapper.selectList(queryWrapper);
    }

    @Test
    public void test_02() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        // 查询用户信息，并按照年龄降序排序，若年龄相同，则按照id升序排序
        queryWrapper.orderByDesc("age")
                .orderByAsc("uid");
        List<User> list = userMapper.selectList(queryWrapper);
    }

    @Test
    public void test_03() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.isNull("email");
        userMapper.delete(queryWrapper);
    }

    @Test
    public void test_04() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        // 将邮箱为空，且名字中有赵或周的用户的邮箱设置为testDemo04.net
        queryWrapper.isNull("email")
                .like("user_name", "赵")
                .or()
                .like("user_name", "周");
        // 会将实体类中设置的字段作为修改后的值
        User user = new User();
        user.setEmail("testDemo04.net");
        userMapper.update(user, queryWrapper);
    }

    @Test
    public void test_05() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        // 将用户名中包含张，且年龄大于15或email为空的用户的email设为testDemo05.net
        // lambda表达式中的条件会优先执行
        queryWrapper.like("user_name", "张")
                .and(el -> el.gt("age", 15).or().isNull("email"));
        // 会将实体类中设置的字段作为修改后的值
        User user = new User();
        user.setEmail("testDemo05.net");
        userMapper.update(user, queryWrapper);
    }

    @Test
    public void test_06() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        // 查询用户名、年龄、邮箱
        queryWrapper.select("user_name", "age", "email");
        List<Map<String, Object>> map = userMapper.selectMaps(queryWrapper);
        map.forEach(System.out::println);
    }

    @Test
    public void test_07() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        // 查询id <= 5 的用户id
        queryWrapper.inSql("uid", "select uid from mp_user where uid < 5");
        List<User> list = userMapper.selectList(queryWrapper);
    }

    @Test
    public void test_08() {
        UpdateWrapper<User> updateWrapper = new UpdateWrapper<>();
        // 修改用户名中有张，并且年龄大于15，id小于6
        updateWrapper.like("user_name", "张")
                .and(el -> el.gt("age", 15)
                        .or()
                        .lt("uid", 6));
        updateWrapper.set("user_name", "宋青书").set("email", "95682314@163.net");
        userMapper.update(null, updateWrapper);
    }

    @Test
    public void test_09() {
        // 模拟从前台接收的数据
        String name = "";
        Integer ageBegin = 14;
        Integer ageEnd = 17;

        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        /*
            判断如何组装条件
                选择mybatis-plus的StringUtils
         */
        if (StringUtils.isNotBlank(name)) {
            queryWrapper.like("user_name", name);
        }
        if (ageBegin != null) {
            queryWrapper.gt("age", ageBegin);
        }
        if (ageEnd != null) {
            queryWrapper.lt("age", ageEnd);
        }
        List<User> list = userMapper.selectList(queryWrapper);
    }

    @Test
    public void test_10() {
        // 模拟从前台接收的数据
        String name = "";
        Integer ageBegin = 14;
        Integer ageEnd = 17;

        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        /*
            判断如何组装条件
                选择mybatis-plus的StringUtils
         */
        queryWrapper.like(StringUtils.isNotBlank(name), "user_name", name)
                .gt(ageBegin != null, "age", ageBegin)
                .lt(ageEnd != null, "age", ageEnd);
        List<User> list = userMapper.selectList(queryWrapper);
    }

    @Test
    public void test_11() {
        // 模拟从前台接收的数据
        String name = "";
        Integer ageBegin = 14;
        Integer ageEnd = 17;

        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        /*
            判断如何组装条件
                选择mybatis-plus的StringUtils
         */
        queryWrapper.like(StringUtils.isNotBlank(name), User::getName, name)
                .gt(ageBegin != null, User::getAge, ageBegin)
                .lt(ageEnd != null, User::getAge, ageEnd);
        List<User> list = userMapper.selectList(queryWrapper);
    }

    @Test
    public void test_12() {
        LambdaUpdateWrapper<User> updateWrapper = new LambdaUpdateWrapper<>();
        // 修改用户名中有张，并且年龄大于15，id小于6
        updateWrapper.like(User::getName, "张")
                .and(el -> el.gt(User::getAge, 15)
                        .or()
                        .lt(User::getId, 6));
        updateWrapper.set(User::getName, "宋青书").set(User::getEmail, "95682314@163.net");
        userMapper.update(null, updateWrapper);
    }
}
