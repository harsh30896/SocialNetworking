package com.socialNetwork.service;

import com.socialNetwork.dto.UserDto;
import com.socialNetwork.entity.User;
import com.socialNetwork.userGlobalExceptions.DuplicateUserException;

public interface UserService {
    User createUser(User user)throws DuplicateUserException;
    Boolean updateUser(Long userId, UserDto userDto);
    String deleteUser(Long userId);
}
