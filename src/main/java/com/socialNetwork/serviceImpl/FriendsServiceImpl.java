package com.socialNetwork.serviceImpl;

import com.socialNetwork.entity.Friends;
import com.socialNetwork.repository.FriendsRepo;
import com.socialNetwork.service.FriendsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FriendsServiceImpl implements FriendsService {

    @Autowired
    FriendsRepo friendsRepo;

    @Override
    public Friends addFriends(Friends friends) {
        return null;
    }
}
