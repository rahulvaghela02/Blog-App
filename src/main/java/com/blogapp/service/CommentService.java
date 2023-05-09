package com.blogapp.service;

import com.blogapp.payload.CommentDto;

import java.util.List;

public interface CommentService {

    CommentDto createComment(long postId,CommentDto commentDto);

    List<CommentDto> getCommentByPostId(long postId);

    CommentDto updateCommentByid(long postId, long id, CommentDto commentDto);

    void deleteComment(long postId, long id);
}
