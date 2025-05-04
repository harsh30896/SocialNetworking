package com.socialNetwork.serviceImpl;

import com.socialNetwork.entity.Post;
import com.socialNetwork.repository.PostRepo;
import com.socialNetwork.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
   PostRepo postRepo;

    @Override
    public Post createPost(Post post) {

    }
}
