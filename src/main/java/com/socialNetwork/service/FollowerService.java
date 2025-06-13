package com.socialNetwork.service;

import com.socialNetwork.dto.FollowerDto;
import com.socialNetwork.entity.Follower;

public interface FollowerService {
    Follower addFollower(FollowerDto followerDto);
}
