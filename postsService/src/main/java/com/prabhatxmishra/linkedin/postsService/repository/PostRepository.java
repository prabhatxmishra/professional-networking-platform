package com.prabhatxmishra.linkedin.postsService.repository;

import com.prabhatxmishra.linkedin.postsService.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findByUserId(Long userId);
}
