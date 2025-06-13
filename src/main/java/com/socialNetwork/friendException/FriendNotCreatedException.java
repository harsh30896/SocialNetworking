package com.socialNetwork.friendException;

import org.springframework.http.HttpStatus;

public class FriendNotCreatedException extends FriendListException{

    public FriendNotCreatedException(HttpStatus status, String message) {
        super(status, message);
    }
}
