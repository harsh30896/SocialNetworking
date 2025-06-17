package com.socialNetwork.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Friends {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long friendListId;

    private Long userId;
    private String friendName;
    private String friendUserName;

    public Long getFriendListId() {
        return friendListId;
    }

    public void setFriendListId(Long friendListId) {
        this.friendListId = friendListId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getFriendName() {
        return friendName;
    }

    public void setFriendName(String friendName) {
        this.friendName = friendName;
    }

    public String getFriendUserName() {
        return friendUserName;
    }

    public void setFriendUserName(String friendUserName) {
        this.friendUserName = friendUserName;
    }


    public Friends(Long friendListId, Long userId, String friendName, String friendUserName) {
        this.friendListId = friendListId;
        this.userId = userId;
        this.friendName = friendName;
        this.friendUserName = friendUserName;
    }

    public Friends(){
    }

}
