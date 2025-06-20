package com.socialNetwork.service;

import com.socialNetwork.dto.FriendsDto;
import com.socialNetwork.entity.Friends;

public interface FriendsService {
    Friends addFriends(FriendsDto friendsDto);
}
