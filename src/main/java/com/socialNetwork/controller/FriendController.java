package com.socialNetwork.controller;

import com.socialNetwork.dto.FriendListDto;
import com.socialNetwork.entity.FriendList;
import com.socialNetwork.response.ApiResponse;
import com.socialNetwork.service.FriendListService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/v1/friend")
public class FriendController {

    @Autowired
    FriendListService friendListService;

    @PostMapping("/addFriend")
    public ResponseEntity<?> addFriend(@RequestBody @Valid FriendListDto friendListDto){
        FriendList friendList = friendListService.addFriendList(friendListDto);
        ApiResponse<FriendList> response = new ApiResponse<>(true,"Friend Created Successfully",friendList,
                LocalDateTime.now());
        return new ResponseEntity<>(response, HttpStatus.CREATED);

    }

}
