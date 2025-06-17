package com.socialNetwork.repository;

import com.socialNetwork.entity.Friends;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FriendsRepo extends JpaRepository<Friends,Long> {
}
