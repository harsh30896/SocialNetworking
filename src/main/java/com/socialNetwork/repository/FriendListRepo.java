package com.socialNetwork.repository;

import com.socialNetwork.entity.FriendList;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FriendListRepo extends JpaRepository<FriendList,Long> {
    Optional<FriendList> findByFriendUserName(String userName);
}
