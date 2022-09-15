package com.chenjy.mp_demo1.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chenjy.mp_demo1.pojo.User;
import org.springframework.stereotype.Repository;

/**
 * @Author: chenJY
 * @Description:
 * @Date: 2022-09-15 17:30
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
}
