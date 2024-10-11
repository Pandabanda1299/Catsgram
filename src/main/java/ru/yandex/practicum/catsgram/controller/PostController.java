package ru.yandex.practicum.catsgram.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.yandex.practicum.catsgram.model.Post;
import ru.yandex.practicum.catsgram.service.PostService;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/posts")
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/{postId}")
    public Optional<Post> findPost(@PathVariable Long postId) {
        return postService.findById(postId);
    }

    @GetMapping
    public Collection<Post> findAll(@RequestParam(required = false ,defaultValue = "0") int page,
                                    @RequestParam(required = false ,defaultValue = "10")  int size,
                                    @RequestParam(value = "sortOrder",required = false, defaultValue = "asc") String sortOrder) {
        return postService.findAll(page, size, sortOrder);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Post create(@RequestBody Post post) {
        return postService.create(post);
    }

    @PutMapping
    public Post update(@RequestBody Post newPost) {
        return postService.update(newPost);
    }
}