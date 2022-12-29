package com.codebuffer.facebookclone.service;

import com.codebuffer.facebookclone.model.Post;

import java.util.List;

public interface PostService {
    Post addPost(Post post) throws Exception;

    List<Post> getPost();
}
