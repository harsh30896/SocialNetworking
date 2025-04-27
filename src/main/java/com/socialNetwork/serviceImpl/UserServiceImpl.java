package com.socialNetwork.serviceImpl;

import com.socialNetwork.entity.User;
import com.socialNetwork.repository.UserRepo;
import com.socialNetwork.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    @Override
    public User createUser(User user) {
        return userRepo.save(user);
    }
    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public User deleteUser(User user) {
        return null;
    }
}
