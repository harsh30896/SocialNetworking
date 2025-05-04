package com.socialNetwork.postGlobalExceptions;

import org.springframework.http.HttpStatus;

public class PostServiceException extends RuntimeException{

    private final HttpStatus status;
    protected PostServiceException(HttpStatus status, String message) {
        super(message);
        this.status = status;
    }

    protected PostServiceException(HttpStatus status, String message, Throwable cause) {
        super(message, cause);
        this.status = status;
    }

    public HttpStatus getStatus() {
        return status;
    }
}
