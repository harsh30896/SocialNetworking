package com.socialNetwork.repository;

import com.socialNetwork.entity.Follower;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FollowerRepo extends JpaRepository<Follower,Long> {
}
