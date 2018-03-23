package com.kennyw.springbootdemo.mapper;

import com.kennyw.springbootdemo.domain.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2018/3/23 0023
 */
@Repository
public interface UserMapper {

    @Select("select * from tb_user where id=#{id}")
    User getUserById(Integer id);

    @Select("select * from tb_user")
    List<User> getUserList();
}
