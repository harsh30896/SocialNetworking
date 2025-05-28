package com.socialNetwork.serviceImpl;

import com.socialNetwork.dto.UserDto;
import com.socialNetwork.repository.UserRepo;
import com.socialNetwork.service.UserService;
import com.socialNetwork.userGlobalExceptions.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    @Override
    public Boolean addUser(UserDto userDto) {
        try{

        }catch (UserNotFoundException userNotFoundException){

        }catch (Exception ex){

        }
    }
}
