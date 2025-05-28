package com.socialNetwork.dto;

import lombok.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class PostDto {

    private Long id;
    private String content;
    private String mediaUrl;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Long userId;
    private List<Comment> commentList;
}
