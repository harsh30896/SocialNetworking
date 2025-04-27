package com.socialNetwork.repository;

import com.socialNetwork.entity.Like;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepo extends JpaRepository<Like,Long> {
}
