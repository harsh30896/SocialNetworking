package com.socialNetwork.serviceImpl;

import com.socialNetwork.dto.UserDto;
import com.socialNetwork.entity.User;
import com.socialNetwork.repository.UserRepo;
import com.socialNetwork.service.UserService;
import com.socialNetwork.userGlobalExceptions.UserAlreadyExistsException;
import com.socialNetwork.userGlobalExceptions.UserCreationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public User addUser(UserDto userDto) {
        userRepo.findByUserName(userDto.getUserName()).ifPresent(user -> {
            throw new UserAlreadyExistsException("User already exists with username: " + userDto.getUserName());
        });

        try {
            User newUser = new User();
            newUser.setUserName(userDto.getUserName());
            newUser.setUserPassword(userDto.getPassword()); // For production, hash this!
            newUser.setName(userDto.getName());
            newUser.setBirthday(userDto.getBirthDate());

            return userRepo.save(newUser);
        }
        catch (Exception e) {
            throw new UserCreationException("User could not be created due to internal error");
        }
    }

    public User updateUser(UserDto userDto){

        userRepo.findByUserName(userDto.getUserName()).ifPresent(user -> {
            throw new UserCreationException("User cannot be updated with username: "+userDto.getUserName());
        });
        try{
            User updateUser=new User();
            updateUser.setName(userDto.getName());
            updateUser.setBirthday(userDto.getBirthDate());
            updateUser.setUserPassword(userDto.getPassword());
            return userRepo.save(updateUser);
        }
        catch (Exception ex) {
            throw new UserCreationException("User cannot be updated with given UserName " + userDto.getUserName() + " Internal Serval Error");
        }
    }
}