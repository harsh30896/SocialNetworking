package com.socialNetwork.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "following")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Following {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "following_id")
    private Long followingId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "following_username", nullable = false)
    private String followingUserName;

    @Column(name = "is_friend", nullable = false)
    private boolean isFriend = false;
}