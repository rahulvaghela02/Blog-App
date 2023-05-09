package com.blogapp.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(
        name = "posts",
        uniqueConstraints ={@UniqueConstraint(columnNames = {"title"})}
       )
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title",nullable = false)
    @NotEmpty
    @Size(min = 2,message = "Post title should be at least 2 charaters")
    private String title;

    @Column(name = "description", nullable = false)
    @NotEmpty
    @Size(min = 10, message = "Description should be at least 10 characters")
    private String description;

    @Lob
    @Column(name = "content",nullable = false)
    @NotEmpty
    private String content;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL, orphanRemoval = true)
    Set<Comment> comments = new HashSet<>();

}
