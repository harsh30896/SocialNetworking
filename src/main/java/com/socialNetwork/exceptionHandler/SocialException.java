package com.socialNetwork.exceptionHandler;

public class SocialException extends RuntimeException {
    private final String errorType;

    public SocialException(String errorType, String message) {
        super(message);
        this.errorType = errorType;
    }

    public String getErrorType() {
        return errorType;
    }
}