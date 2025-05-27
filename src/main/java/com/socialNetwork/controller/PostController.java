package com.socialNetwork.controller;

import com.socialNetwork.dto.PostDto;
import com.socialNetwork.entity.Post;
import com.socialNetwork.enums.ErrorCode;
import com.socialNetwork.postGlobalExceptions.PostServiceException;
import com.socialNetwork.repository.PostRepo;
import com.socialNetwork.response.ApiResponse;
import com.socialNetwork.service.PostService;
import com.socialNetwork.userGlobalExceptions.DuplicateUserException;
import com.socialNetwork.userGlobalExceptions.PostNotFoundException;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/v1/post")
public class PostController {

    @Autowired
    PostService postService;

    @Autowired
    PostRepo postRepo;

    @PostMapping("/createPost")
    public ResponseEntity<ApiResponse<PostDto>> createPost(@RequestBody PostDto postDto) {
        try {
            Post createdPost = postService.createPost(postDto);
            return ResponseEntity.status(HttpStatus.CREATED)
                    .body(new ApiResponse<>(true,
                            "User Created Successfully",
                            null,
                            LocalDateTime.now()));
        } catch (PostServiceException postServiceException) {
            return ResponseEntity.status(HttpStatus.CONFLICT)
                    .body(new ApiResponse<>(false,
                            postServiceException.getMessage(),
                            null,
                            LocalDateTime.now()));
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.CONFLICT)
                    .body(new ApiResponse<>(
                            false,
                            ex.getMessage(),
                            null,
                            LocalDateTime.now()
                    ));
        }
    }

    @PatchMapping("/updatePost")
    public ResponseEntity<ApiResponse<PostDto>> updatePost(@RequestBody PostDto postDto){
            try{
                Post updatedPost = new Post();
                updatedPost.setUpdatedAt(postDto.getUpdatedAt());
                updatedPost.setCreatedAt(postDto.getCreatedAt());
                updatedPost.setContent(postDto.getContent());
                updatedPost.setMediaUrl(postDto.getMediaUrl());
                postRepo.save(updatedPost);
                return ResponseEntity.ok(new ApiResponse<>("User Updated Successfully", true, LocalDateTime.now()));
            }catch (PostNotFoundException postNotFoundException){
                throw new PostNotFoundException("Post Not Found Exception",Boolean.FALSE, ErrorCode.POST_NOT_FOUND);
            }catch (Exception ex){
                ex.printStackTrace();
                throw new PostNotFoundException("Post Not Found Exception",Boolean.FALSE, ErrorCode.POST_NOT_FOUND);
            }
    }
}
