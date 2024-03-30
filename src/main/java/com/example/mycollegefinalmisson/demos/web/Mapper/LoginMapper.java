package com.example.mycollegefinalmisson.demos.web.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mycollegefinalmisson.demos.web.Entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.jdbc.repository.config.MyBatisJdbcConfiguration;

import java.io.Serializable;

/**
 * Description:
 * User: Lenhao
 * Date: 2024-03-27
 * Time: 9:52
 */
@Mapper
public interface LoginMapper extends BaseMapper<User> {
    @Select("select * from User where UserId = #{UserId} and UserPasswd = #{UserPasswd}")
    User SelectUserIdandPassword(@Param("UserId")String userId,@Param("UserPasswd")String UserPassword);
}
