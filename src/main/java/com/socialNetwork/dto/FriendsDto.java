package com.socialNetwork.dto;

public class FriendsDto {

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

    public FriendsDto(Long friendListId, Long userId, String friendName, String friendUserName) {
        this.friendListId = friendListId;
        this.userId = userId;
        this.friendName = friendName;
        this.friendUserName = friendUserName;
    }

    public FriendsDto(){
    }

}
