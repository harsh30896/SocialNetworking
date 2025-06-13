package com.socialNetwork.friendException;

import org.springframework.http.HttpStatus;

public class FriendListException extends RuntimeException{

    private final HttpStatus status;
    protected FriendListException(HttpStatus status, String message) {
        super(message);
        this.status = status;
    }

}
