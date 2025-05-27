package com.socialNetwork.serviceImpl;

import com.socialNetwork.dto.UserDto;
import com.socialNetwork.repository.FriendshipRepo;
import com.socialNetwork.service.FriendshipService;
import org.springframework.beans.factory.annotation.Autowired;

public class FriendshipServiceImpl implements FriendshipService {

    @Autowired
    FriendshipRepo friendshipRepo;

    @Override
    public Boolean addFriend(UserDto user) {

    }

    @Override
    public Boolean removeFriend(UserDto user) {
        return null;
    }
}
