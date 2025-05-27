package com.socialNetwork.service;

import com.socialNetwork.dto.PostDto;
import com.socialNetwork.entity.Post;

public interface PostService {

    Post createPost(PostDto postDto);

}
