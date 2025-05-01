package com.socialNetwork.globalException;

public class UserDeletionException extends RuntimeException{
    UserDeletionException(String message){
        super(message);
    }
    UserDeletionException(String message,Throwable cause){
        super(message,cause);
    }
}
