package com.socialNetwork.controller;

import com.socialNetwork.dto.UserDto;
import com.socialNetwork.entity.User;
import com.socialNetwork.exceptionHandler.SocialException;
import com.socialNetwork.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/addUser")
    public ResponseEntity<?> addUser(@RequestBody UserDto userDto){
        try {
            User addUserService = userService.addUser(userDto);
            return ResponseEntity.ok(addUserService);
        }catch (SocialException socialException){
            throw  socialException;
        }
    }
}

