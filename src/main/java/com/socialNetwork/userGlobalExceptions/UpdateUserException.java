package com.socialNetwork.userGlobalExceptions;

public class UpdateUserException extends RuntimeException{
    UpdateUserException(String message){
        super(message);
    }
    UpdateUserException(String message,Throwable cause){
        super(message,cause);
    }
}
