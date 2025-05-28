package com.socialNetwork.controller;

import com.socialNetwork.dto.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

        @PostMapping("/addUser")
        public ResponseEntity<?> addUserAccount(@RequestBody UserDto userDto){

        }

}
