package com.socialNetwork.enums;

public enum ErrorCode {
    USER_NOT_FOUND("1001"),
    DUPLICATE_USER_EXISTS("1002"),
    USER_CANNOT_UPDATED("1003"),
    POST_NOT_FOUND("1004");

    private final String errorCode;

     ErrorCode(String errorCode){
        this.errorCode=errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

}
