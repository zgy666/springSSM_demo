package com.demo.dao;


import com.demo.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDAO{

    User queryUserById(Long id);

    Long queryListByConditionCount(@Param("entity") User user);

    List<User> queryListByCondition(@Param("entity") User user);
}
