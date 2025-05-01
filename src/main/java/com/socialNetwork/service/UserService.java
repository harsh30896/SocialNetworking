package com.socialNetwork.service;

import com.socialNetwork.entity.User;

public interface UserService {
    User createUser(User user);
    User updateUser(User user);
    String deleteUser(Long userId);
}
