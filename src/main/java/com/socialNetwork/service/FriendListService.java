package com.socialNetwork.service;

import com.socialNetwork.dto.FriendListDto;
import com.socialNetwork.dto.UserDto;
import com.socialNetwork.entity.FriendList;
import com.socialNetwork.entity.User;
import com.socialNetwork.repository.FriendListRepo;

public interface FriendListService {

    FriendList addFriendList(FriendListDto friendListDto);

}
