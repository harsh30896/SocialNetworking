package com.socialNetwork.userGlobalExceptions;

import com.socialNetwork.enums.ErrorCode;
import com.socialNetwork.exception.SocialNetworkException;

public class PostNotFoundException extends SocialNetworkException {
    public PostNotFoundException(String message, Boolean status, Object payload, ErrorCode errorCode) {
        super(message, status, payload, errorCode);
    }

    public PostNotFoundException(String message, Boolean status, ErrorCode errorCode) {
        super(message, status, errorCode);
    }
}
