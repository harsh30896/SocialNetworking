package com.socialNetwork.entity;

import jakarta.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FriendListId")
    private Long friendListId;

    @Column(name = "UserId")
    private Long userId;

    @Column(name = "Friend_Name")
    private String friendName;

    @Column(name = "FriendUserName")
    private String friendUserName;
}