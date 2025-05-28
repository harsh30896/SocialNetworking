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
@Table(name = "FriendList")
public class FriendList {
    @Id
    @Column(name = "FriendListId")
    private Long friendListId;

    @Column(name = "UserId")
    private Long userId;

    @Column(name = "Friend_Name")
    private String friendName;

    @Column(name = "FriendUserName")
    private String friendUserName;
}