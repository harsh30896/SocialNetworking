package com.socialNetwork.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

        private Long userId;
        private String userName;
        private String name;
        private String password;
        private String birthDate;
}
