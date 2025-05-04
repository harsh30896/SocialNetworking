package com.socialNetwork.service;

import com.socialNetwork.dto.UserDto;
import com.socialNetwork.entity.User;

public interface UserService {
    User createUser(User user);
    Boolean updateUser(Long userId, UserDto userDto);
    String deleteUser(Long userId);
}
