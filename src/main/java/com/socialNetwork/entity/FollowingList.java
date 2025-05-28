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
@Table(name = "FollowingList")
public class FollowingList {
    @Id
    @Column(name = "FollowingList_Id")
    private Long followingListId;

    @Column(name = "User_Id")
    private Long userId;

    @Column(name = "FriendUserName")
    private String friendUserName;
}