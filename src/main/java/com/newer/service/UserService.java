package com.newer.service;

import com.newer.bean.User;

import java.util.List;

public interface UserService {

    int addUser(User user);

    List<User> findAll();

    User findById(int userId);
}
