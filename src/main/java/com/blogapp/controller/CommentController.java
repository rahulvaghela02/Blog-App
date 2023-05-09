package com.blogapp.controller;

import com.blogapp.payload.CommentDto;
import com.blogapp.service.CommentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class CommentController {

    private CommentService commentService;

    public CommentController(CommentService commentService)
    {
        this.commentService = commentService;
    }

    @PostMapping("/posts/{postId}/comments")
    public ResponseEntity<CommentDto> createNewComment(@PathVariable("postId") long postId, @RequestBody CommentDto commentDto)
    {
        CommentDto commentDto1 = commentService.createComment(postId, commentDto);
        return new ResponseEntity<>(commentDto1, HttpStatus.CREATED);
    }

    @GetMapping("/posts/{postId}/comments")
    public List<CommentDto> getAllCommentsByPostId(@PathVariable("postId") long postId)
    {
        List<CommentDto> commentDtoList = commentService.getCommentByPostId(postId);
        return commentDtoList;
    }

    @PutMapping("/posts/{postId}/comments/{id}")
    public ResponseEntity<CommentDto> updatePostById(
            @PathVariable("postId") long postId,
            @PathVariable("id") long id,
            @RequestBody CommentDto commentDto
            )
    {
        CommentDto dto = commentService.updateCommentByid(postId, id, commentDto);
        return new ResponseEntity<>(dto,HttpStatus.OK);
    }

    @DeleteMapping("/posts/{postId}/comments/{id}")
    public ResponseEntity<String> deleteComment(
        @PathVariable("postId") long postId,
        @PathVariable("id") long id
    )
    {
        commentService.deleteComment(postId,id);
        return new ResponseEntity<>("Comment is Deleted",HttpStatus.OK);
    }

}
