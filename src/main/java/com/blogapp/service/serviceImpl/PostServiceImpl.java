package com.blogapp.service.serviceImpl;

import com.blogapp.entities.Post;
import com.blogapp.exception.ResourceNotFoundException;
import com.blogapp.payload.PostDto;
import com.blogapp.payload.PostResponse;
import com.blogapp.repository.PostRepository;
import com.blogapp.service.PostService;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepo;

    private ModelMapper mapper;

    public PostServiceImpl(PostRepository postRepo, ModelMapper mapper)
    {
        this.postRepo = postRepo;
        this.mapper = mapper;
    }

    @Override
    public PostDto createPost(PostDto postDto)
    {
        Post post = mapToEntity(postDto);

        Post savedPost = postRepo.save(post);

        PostDto dto = mapToDto(savedPost);

        return dto;
    }

    @Override
    public PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir)
    {
        Sort sort = sortDir.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortBy).ascending() : Sort.by(sortBy).descending();

        Pageable pageable = PageRequest.of(pageNo,pageSize, sort);

        Page<Post> allPosts = postRepo.findAll(pageable);
        List<Post> content = allPosts.getContent();

        List<PostDto> contents = content.stream().map(posts -> mapToDto(posts)).collect(Collectors.toList());

        PostResponse postResponse = new PostResponse();
        postResponse.setContent(contents);
        postResponse.setPageNo(allPosts.getNumber());
        postResponse.setPageSize(allPosts.getSize());
        postResponse.setTotalPages(allPosts.getTotalPages());
        postResponse.setTotalElements(allPosts.getTotalElements());
        postResponse.setLast(allPosts.isLast());

        return postResponse;
    }

    @Override
    public PostDto getPostById(long id)
    {
        Post post = postRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post","id",id));
        return mapToDto(post);
    }

    @Override
    public void deletePostById(long id)
    {
        postRepo.deleteById(id);
    }

    @Override
    public PostDto updatePostById(PostDto postDto, long id)
    {
        Post post = postRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post", "id", id));

        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());

        Post savedPost = postRepo.save(post);

        return mapToDto(savedPost);
    }

    public Post mapToEntity(PostDto postDto)
    {
        Post post = mapper.map(postDto, Post.class);
//        Post post = new Post();
//        post.setTitle(postDto.getTitle());
//        post.setDescription(postDto.getDescription());
//        post.setContent(postDto.getContent());
        return  post;
    }

    public PostDto mapToDto(Post post)
    {
        PostDto postDto = mapper.map(post, PostDto.class);
//        PostDto postDto = new PostDto();
//        postDto.setId(post.getId());
//        postDto.setTitle(post.getTitle());
//        postDto.setDescription(post.getDescription());
//        postDto.setContent(post.getContent());
        return postDto;
    }

}
