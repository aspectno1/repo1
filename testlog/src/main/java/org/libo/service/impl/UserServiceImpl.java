package org.libo.service.impl;

import org.libo.entity.User;
import org.libo.mapper.UserMapper;
import org.libo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public int addUser(User user) {
        return userMapper.Add(user);
    }

    @Override
    public User seeUser(int id) {
        return userMapper.Sel(id);
    }
}
