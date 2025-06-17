package com.socialNetwork.exceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(SocialException.class)
    public ResponseEntity<Map<String, String>> handleSocialException(SocialException ex) {
        Map<String, String> errorResponse = new HashMap<>();
        errorResponse.put("error", ex.getErrorType());
        errorResponse.put("message", ex.getMessage());

        HttpStatus status = switch (ex.getErrorType()) {
            case "USER_ALREADY_EXISTS" -> HttpStatus.CONFLICT;
            case "USER_NOT_FOUND" -> HttpStatus.NOT_FOUND;
            case "FRIENDSHIP_EXISTS" -> HttpStatus.CONFLICT;
            default -> HttpStatus.BAD_REQUEST;
        };

        return new ResponseEntity<>(errorResponse, status);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String, String>> handleGenericException(Exception ex) {
        Map<String, String> errorResponse = new HashMap<>();
        errorResponse.put("error", "SERVER_ERROR");
        errorResponse.put("message", "Something went wrong");
        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}