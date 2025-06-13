package com.socialNetwork.dto;

public class FriendListDto {


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
}
