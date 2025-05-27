package com.socialNetwork.exception;

import com.socialNetwork.enums.ErrorCode;

public class SocialNetworkException extends RuntimeException{

    private String message;
    private Boolean status;
    private Object payload;
    private ErrorCode errorCode;


    public SocialNetworkException(String message, Boolean status, Object payload, ErrorCode errorCode) {
        super(message);
        this.message = message;
        this.status = status;
        this.payload = payload;
        this.errorCode = errorCode;
    }


    public SocialNetworkException(String message, Boolean status, ErrorCode errorCode) {
        super(message);
        this.message = message;
        this.status = status;
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }

    public Object getPayload() {
        return payload;
    }

    public Boolean getStatus() {
        return status;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
