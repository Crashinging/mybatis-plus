package com.example.mp_demo2.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mp_demo2.pojo.User;
import com.example.mp_demo2.service.UserService;
import com.example.mp_demo2.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author chen
* @description 针对表【mp_user】的数据库操作Service实现
* @createDate 2022-09-15 21:16:05
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




