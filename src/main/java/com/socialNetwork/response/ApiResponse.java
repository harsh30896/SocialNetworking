package com.socialNetwork.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
public class ApiResponse<T> {

    private boolean success;
    private String message;
    private T data;
    private LocalDateTime localDateTime;

    public ApiResponse(String message, boolean success, LocalDateTime localDateTime) {
        this.message = message;
        this.success = success;
        this.localDateTime = localDateTime;
    }
}