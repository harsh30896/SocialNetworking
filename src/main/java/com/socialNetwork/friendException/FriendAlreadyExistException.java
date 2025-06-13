package com.socialNetwork.friendException;

import org.springframework.http.HttpStatus;

public class FriendAlreadyExistException extends FriendListException{

    protected FriendAlreadyExistException(HttpStatus status, String message) {
        super(status, message);
    }
}
