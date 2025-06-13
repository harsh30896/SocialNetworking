package com.socialNetwork.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UserId")
    private Long userId;

    @Column(name = "UserName", nullable = false, unique = true)
    private String userName;

    @Column(name = "UserPassword", nullable = false)
    private String userPassword;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "Birthday")
    private LocalDate birthday;

}
