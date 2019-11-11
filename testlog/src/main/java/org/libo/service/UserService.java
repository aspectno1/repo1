package org.libo.service;

import org.libo.entity.User;

public interface UserService {
    int addUser(User user);
    User seeUser(int id);
}
