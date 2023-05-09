package com.blogapp.payload;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class PostDto {

    private long id;

    private String title;

    private String description;

    private String content;

}
