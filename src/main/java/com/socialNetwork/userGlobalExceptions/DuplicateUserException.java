package com.socialNetwork.userGlobalExceptions;

import com.socialNetwork.enums.ErrorCode;
import com.socialNetwork.exception.SocialNetworkException;

public class DuplicateUserException extends SocialNetworkException {

    public DuplicateUserException(String message, Boolean status, Object payload, ErrorCode errorCode) {
        super(message, status, payload, errorCode);
    }

    public DuplicateUserException(String message, Boolean status, ErrorCode errorCode) {
        super(message, status, errorCode);
    }
}

