package com.socialNetwork.repository;

import com.socialNetwork.entity.FollowingList;
import com.socialNetwork.entity.FriendList;
import com.socialNetwork.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FollowerListRepo extends JpaRepository<FollowingList,Long> {
}
