package com.blogapp.service;

import com.blogapp.payload.PostDto;
import com.blogapp.payload.PostResponse;

import java.util.List;

public interface PostService {

    PostDto createPost(PostDto postDto);

    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);

    PostDto getPostById(long id);

    void deletePostById(long id);

    PostDto updatePostById(PostDto postDto, long id);
}
