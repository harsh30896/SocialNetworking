package com.socialNetwork.userGlobalExceptions;

import org.springframework.http.HttpStatus;

public abstract class UserServiceException extends RuntimeException {
    private final HttpStatus status;

    protected UserServiceException(HttpStatus status, String message) {
        super(message);
        this.status = status;
    }

    protected UserServiceException(HttpStatus status, String message, Throwable cause) {
        super(message, cause);
        this.status = status;
    }

    public HttpStatus getStatus() {
        return status;
    }
}