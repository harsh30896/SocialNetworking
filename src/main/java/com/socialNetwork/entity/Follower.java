package com.socialNetwork.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Follower")
public class Follower {
    @Id
    @Column(name = "FollowerId")
    private Long followerId;

    @Column(name = "UserId")
    private Long userId;

    @Column(name = "FriendUserName")
    private String friendUserName;
}
