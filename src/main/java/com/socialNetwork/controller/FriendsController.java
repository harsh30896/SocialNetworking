package com.socialNetwork.controller;

import com.socialNetwork.dto.FriendsDto;
import com.socialNetwork.entity.Friends;
import com.socialNetwork.exceptionHandler.SocialException;
import com.socialNetwork.service.FriendsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class FriendsController {

    @Autowired
    FriendsService friendsService;

        @PostMapping("/addFriends")
        public ResponseEntity<?> addFriends(@RequestBody FriendsDto friendsDto){
            try {
                Friends friends = friendsService.addFriends(friendsDto);
                return ResponseEntity.ok(friends);
            }catch (SocialException socialException){
                throw socialException;
            }
        }
}
