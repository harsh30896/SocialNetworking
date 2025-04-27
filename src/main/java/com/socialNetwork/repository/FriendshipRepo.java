package com.socialNetwork.repository;

import com.socialNetwork.entity.Friendship;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FriendshipRepo extends JpaRepository<Friendship,Long> {
}
