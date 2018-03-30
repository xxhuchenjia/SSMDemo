package com.newer.service;

import com.newer.bean.User;
import com.newer.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("userService")
@Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly = true)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,rollbackFor = Exception.class)
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    public List<User> findAll() {
        return userMapper.findAll();
    }

    public User findById(int userId) {
        return userMapper.findById(userId);
    }
}
