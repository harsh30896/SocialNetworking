package com.socialNetwork.controller;

import com.socialNetwork.dto.UserDto;
import com.socialNetwork.entity.User;
import com.socialNetwork.userGlobalExceptions.DuplicateUserException;
import com.socialNetwork.userGlobalExceptions.UpdateUserException;
import com.socialNetwork.userGlobalExceptions.UserDeletionException;
import com.socialNetwork.response.ApiResponse;
import com.socialNetwork.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/createUser")
    public ResponseEntity<ApiResponse<UserDto>> createUser(@Valid @RequestBody UserDto userDto) {
        try {
            // Convert DTO to entity
            User user = new User();
            user.setUsername(userDto.getUsername());
            user.setEmail(userDto.getEmail());
            user.setFirstName(userDto.getFirstName());
            user.setLastName(userDto.getLastName());

            // Create user
            User createdUser = userService.createUser(user);
            UserDto responseDto = new UserDto();
            responseDto.setId(createdUser.getId());
            responseDto.setUsername(createdUser.getUsername());
            responseDto.setEmail(createdUser.getEmail());
            responseDto.setFirstName(createdUser.getFirstName());
            responseDto.setLastName(createdUser.getLastName());

            // Return successful response
            return ResponseEntity.status(HttpStatus.CREATED)
                    .body(new ApiResponse<>(
                            true,
                            "User created successfully",
                            responseDto,
                            LocalDateTime.now()
                    ));
        } catch (DuplicateUserException ex) {
            // Handle specific exceptions
            return ResponseEntity.status(HttpStatus.CONFLICT)
                    .body(new ApiResponse<>(
                            false,
                            ex.getMessage(),
                            null,
                            LocalDateTime.now()
                    ));
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(new ApiResponse<>(
                            false,
                            "An error occurred while creating user",
                            null,
                            LocalDateTime.now()
                    ));
        }

    }

    @DeleteMapping("/deleteUser/{userId}")
    public ResponseEntity<ApiResponse<Void>> deleteUser(@PathVariable Long userId){
        try{
            userService.deleteUser(userId);
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(new ApiResponse<>(true,
                    "User Deleted Successfully",
                    null,
                    LocalDateTime.now()));
        }catch (UserDeletionException ex){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ApiResponse<>
                    (false,
                            "An error occurred while deleting user",
                            null,
                            LocalDateTime.now()));
        }catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(new ApiResponse<>(
                            false,
                            "An error occurred while deleting user",
                            null,
                            LocalDateTime.now()
                    ));
        }
    }

    @PatchMapping ("/updateUser/{userId}")
    public ResponseEntity<ApiResponse<Void>> updateUser(@PathVariable Long userId,UserDto userDto){
        try{
            userService.updateUser(userId,userDto);
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(new ApiResponse<>(true,
                    "User Updated Successfully",
                    null,
                    LocalDateTime.now()));
        }catch (UpdateUserException updateUserException){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ApiResponse<>
                    (false,
                            "An error occurred while updating user",
                            null,
                            LocalDateTime.now()));
        }catch (Exception ex){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(new ApiResponse<>(
                        false,
                        "An error occurred while deleting user",
                        null,
                        LocalDateTime.now()
                ));
        }
    }

}
