package com.socialNetwork.postGlobalExceptions;

import org.springframework.http.HttpStatus;

public class PostCreatedException extends  PostServiceException{
    protected PostCreatedException(HttpStatus status, String message) {
        super(status, message);
    }
    protected PostCreatedException(HttpStatus status, String message, Throwable cause) {
        super(status, message, cause);
    }
}
