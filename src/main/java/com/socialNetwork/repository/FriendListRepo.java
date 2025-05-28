package com.socialNetwork.repository;

import com.socialNetwork.entity.FriendList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FriendListRepo extends JpaRepository<FriendList,Long> {
}
