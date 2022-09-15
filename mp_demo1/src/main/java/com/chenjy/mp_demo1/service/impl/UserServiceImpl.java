package com.chenjy.mp_demo1.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chenjy.mp_demo1.mapper.UserMapper;
import com.chenjy.mp_demo1.pojo.User;
import com.chenjy.mp_demo1.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Author: chenJY
 * @Description:
 * @Date: 2022-09-15 17:37
 */
@Service
@DS("master") // 设置要操作的数据源 切换数据源，可以写在方法上或类上
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
