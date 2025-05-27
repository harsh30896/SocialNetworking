package com.socialNetwork.service;

import com.socialNetwork.dto.UserDto;

public interface FriendshipService {
    public Boolean addFriend(UserDto user);
    public Boolean removeFriend(UserDto user);
}
