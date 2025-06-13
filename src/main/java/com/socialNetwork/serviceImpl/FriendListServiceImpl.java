package com.socialNetwork.serviceImpl;

import com.socialNetwork.dto.FriendListDto;
import com.socialNetwork.entity.FriendList;
import com.socialNetwork.friendException.FriendNotCreatedException;
import com.socialNetwork.repository.FriendListRepo;
import com.socialNetwork.service.FriendListService;
import com.socialNetwork.userGlobalExceptions.UserAlreadyExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class FriendListServiceImpl implements FriendListService {

    @Autowired
    FriendListRepo friendListRepo;

    @Override
    public FriendList addFriendList(FriendListDto friendListDto) {
        friendListRepo.findByFriendUserName(friendListDto.getFriendUserName()).ifPresent(friendList-> {
            throw new UserAlreadyExistsException("Friend Already Exists "+friendListDto.getFriendUserName());
        });
        try{
            FriendList friendList = new FriendList();
            friendList.setFriendListId(friendListDto.getFriendListId());
            friendList.setFriendName(friendList.getFriendUserName());
            friendList.setFriendUserName(friendListDto.getFriendUserName());
            return friendListRepo.save(friendList);
        }catch (Exception exception){
            throw  new FriendNotCreatedException(HttpStatus.BAD_REQUEST,"Friend Cannot be created");

        }

    }

}
