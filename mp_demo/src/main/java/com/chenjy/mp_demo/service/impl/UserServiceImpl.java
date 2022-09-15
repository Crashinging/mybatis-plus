package com.chenjy.mp_demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chenjy.mp_demo.mapper.UserMapper;
import com.chenjy.mp_demo.pojo.User;
import com.chenjy.mp_demo.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Author: chenJY
 * @Description:
 * @Date: 2022-09-14 20:32
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
