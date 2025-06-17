package com.socialNetwork.service;

import com.socialNetwork.dto.UserDto;
import com.socialNetwork.entity.User;

public interface UserService {
    User addUser(UserDto userDto);
}
