package com.socialNetwork.controller;

import com.socialNetwork.dto.UserDto;
import com.socialNetwork.entity.User;
import com.socialNetwork.response.ApiResponse;
import com.socialNetwork.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;


@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/user")
public class UserController {

        @Autowired
        private UserService userService;

        @PostMapping("/addUser")
        public ResponseEntity<ApiResponse<User>> addUserAccount(@RequestBody @Valid UserDto userDto) {
                User createdUser = userService.addUser(userDto);
                ApiResponse<User> response = new ApiResponse<>(true, "User created successfully", createdUser, LocalDateTime.now());
                return new ResponseEntity<>(response, HttpStatus.CREATED);
        }

        public ResponseEntity<ApiResponse<?>> updateUser(@RequestBody @Valid UserDto userDto){
                User updatedUser = userService.updateUser(userDto);
                ApiResponse<User> response = new ApiResponse<>(true,"User updated successfully",updatedUser,LocalDateTime.now());
                return new ResponseEntity<>(response,HttpStatus.CREATED);
        }
}
