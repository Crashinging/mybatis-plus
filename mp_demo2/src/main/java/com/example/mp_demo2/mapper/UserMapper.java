package com.example.mp_demo2.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.example.mp_demo2.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author chen
* @description 针对表【mp_user】的数据库操作Mapper
* @createDate 2022-09-15 21:16:05
* @Entity com.example.mp_demo2.pojo.User
*/
public interface UserMapper extends BaseMapper<User> {
    int insertSelective(User user);

    int deleteByUidAndAge(@Param("uid") Long uid, @Param("age") Integer age);

    int updateAgeAndSexByUid(@Param("age") Integer age, @Param("sex") Integer sex, @Param("uid") Long uid);

    List<User> selectAllByAgeAndSexBetweenOrderByUid(@Param("age") Integer age, @Param("beginSex") Integer beginSex, @Param("endSex") Integer endSex);
}




