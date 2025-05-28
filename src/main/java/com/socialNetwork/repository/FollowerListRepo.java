package com.socialNetwork.repository;

import com.socialNetwork.entity.FollowingList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FollowerListRepo extends JpaRepository<FollowingList,Long> {
}
