package com.socialNetwork.serviceImpl;

import com.socialNetwork.dto.UserDto;
import com.socialNetwork.entity.User;
import com.socialNetwork.repository.UserRepo;
import com.socialNetwork.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    @Override
    public User createUser(User user) {
        return userRepo.save(user);
    }
    @Override
    public Boolean updateUser(Long userId,UserDto userDto) {
        Optional<User> existingUser = userRepo.findById(userId);
        User updatedUser = new User();
        if(!existingUser.isPresent()){
            return Boolean.FALSE;
        }
        updatedUser.setEmail(userDto.getEmail());
        updatedUser.setUsername(userDto.getUsername());
        updatedUser.setFirstName(userDto.getFirstName());
        updatedUser.setLastName(userDto.getLastName());
        userRepo.save(updatedUser);
        return Boolean.TRUE;
    }

    @Override
    public String deleteUser(Long userId) {
     Optional<User> existingUser = userRepo.findById(userId);
     if(!existingUser.isPresent()){
         return "User not exist with given User Id";
     }
      userRepo.deleteById(userId);
        return "User Deleted";
    }
}
