package com.socialNetwork.serviceImpl;

import com.socialNetwork.dto.UserDto;
import com.socialNetwork.entity.User;
import com.socialNetwork.exceptionHandler.SocialException;
import com.socialNetwork.repository.UserRepository;
import com.socialNetwork.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User addUser(UserDto userDto) {
        if(userDto.getUserId() == null) {
            throw new SocialException("INVALID_DATA", "User ID is required");
        }
        else if(userRepository.existsById(userDto.getUserId())) {
            throw new SocialException("USER_ALREADY_EXISTS",
                    "User with ID " + userDto.getUserId() + " already exists");
        }
        User user = new User();
        user.setUserName(userDto.getUserName());
        user.setBirthday(userDto.getBirthday());
        user.setLocation(userDto.getLocation());
        user.setPassWord(userDto.getPassWord());
        user.setName(userDto.getName());
        return userRepository.save(user);
    }
}
