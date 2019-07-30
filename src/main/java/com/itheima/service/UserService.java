package com.itheima.service;

import com.itheima.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {
    User login(String username, String password);

    List<User> list();
}
