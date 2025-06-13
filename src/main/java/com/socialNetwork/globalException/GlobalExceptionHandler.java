package com.socialNetwork.globalException;

import com.socialNetwork.friendException.FriendAlreadyExistException;
import com.socialNetwork.friendException.FriendNotCreatedException;
import com.socialNetwork.response.ApiResponse;
import com.socialNetwork.userGlobalExceptions.UserAlreadyExistsException;
import com.socialNetwork.userGlobalExceptions.UserCreationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(UserAlreadyExistsException.class)
    public ResponseEntity<ApiResponse<Void>> handleUserExists(UserAlreadyExistsException ex) {
        ApiResponse<Void> response = new ApiResponse<>(false, ex.getMessage(), null, LocalDateTime.now());
        return new ResponseEntity<>(response, HttpStatus.CONFLICT);
    }

    @ExceptionHandler(UserCreationException.class)
    public ResponseEntity<ApiResponse<Void>> handleCreationError(UserCreationException ex) {
        ApiResponse<Void> response = new ApiResponse<>(false, ex.getMessage(), null, LocalDateTime.now());
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(FriendNotCreatedException.class)
    public ResponseEntity<ApiResponse<Void>> handleFriendNotCreated(FriendNotCreatedException ex) {
        ApiResponse<Void> response = new ApiResponse<>(false, "Friend Not Created Exception", null, LocalDateTime.now());
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(FriendAlreadyExistException.class)
    public ResponseEntity<ApiResponse<Void>> handleFriendAlreadyExistException(FriendAlreadyExistException ex) {
        ApiResponse<Void> response = new ApiResponse<>(false, "Friend Already Exists", null, LocalDateTime.now());
        return new ResponseEntity<>(response, HttpStatus.CONFLICT);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiResponse<Void>> handleGenericError(Exception ex) {
        ApiResponse<Void> response = new ApiResponse<>(false, "Unexpected error occurred", null, LocalDateTime.now());
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
