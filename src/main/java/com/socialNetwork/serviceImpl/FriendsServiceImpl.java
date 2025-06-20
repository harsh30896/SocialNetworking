package com.socialNetwork.serviceImpl;

import com.socialNetwork.dto.FriendsDto;
import com.socialNetwork.entity.Friends;
import com.socialNetwork.exceptionHandler.SocialException;
import com.socialNetwork.repository.FriendsRepo;
import com.socialNetwork.service.FriendsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FriendsServiceImpl implements FriendsService {

    @Autowired
    FriendsRepo friendsRepo;

    @Override
    public Friends addFriends(FriendsDto friendsDto) {
        String friendName = friendsDto.getFriendUserName();
        Friends friendUserName = friendsRepo.findByFriendUserName(friendName);
        if(friendUserName != null){
            throw new SocialException("FRIENDSHIP_EXISTS", " " + friendsDto.getUserId() + " already exists");
        }
        else if(friendsDto != null && friendUserName != null) {
            Friends friends = new Friends();
            friends.setUserId(friendsDto.getUserId());
            friends.setFriendName(friendsDto.getFriendName());
            friends.setFriendUserName(friendsDto.getFriendUserName());
            return friendsRepo.save(friends);
        }
        else {
            throw new SocialException("FRIEND_CANNOT_FOUND", " " + friendsDto.getUserId() + " friend cannot be found");
        }
    }
}
