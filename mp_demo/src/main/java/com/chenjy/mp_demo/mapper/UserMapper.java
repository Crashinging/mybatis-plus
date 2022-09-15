package com.chenjy.mp_demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.chenjy.mp_demo.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * @Author: chenJY
 * @Description:
 * @Date: 2022-09-14 9:35
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
    /**
     * @Description 根据id查询用户信息为map的集合
     * @param id
     * @return Map<Object>
    */
    Map<String, Object> selectMapById(Long id);

    /**
     * @Description 通过年龄查询用户信息并返回
     * @param page mp提供的分页对象，必须是参数列表第一个参数
     * @param age
     * @return Page<User>
    */
    Page<User> selectPagePo(@Param("page") Page<User> page, @Param("age") Integer age);

}
