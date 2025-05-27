package com.socialNetwork.serviceImpl;

import com.socialNetwork.dto.PostDto;
import com.socialNetwork.entity.Post;
import com.socialNetwork.entity.User;
import com.socialNetwork.repository.PostRepo;
import com.socialNetwork.repository.UserRepo;
import com.socialNetwork.service.PostService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Transactional
public class PostServiceImpl implements PostService {

    @Autowired
   PostRepo postRepo;

    @Autowired
    UserRepo userRepo;

    @Override
    public Post createPost(PostDto postDto) {
        // create post with user id and with different time stamp
        // user can have similar post on different timeline

        Optional<User> byId = userRepo.findById(postDto.getUserId());
        Post post =new Post();
        post.setUser(byId.get());

        // object mapper
        // bean utils open source library
        post.setContent(postDto.getContent());
        post.setCreatedAt(postDto.getCreatedAt());
        post.setUpdatedAt(postDto.getUpdatedAt());
        post.setMediaUrl(postDto.getMediaUrl());
        post.setComments(postDto.getCommentList());
        Post createdPost = postRepo.save(post);

        return createdPost;
    }
}
