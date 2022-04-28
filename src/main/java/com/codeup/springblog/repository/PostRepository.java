package com.codeup.springblog.repository;

import com.codeup.springblog.Post;
//import com.codeup.springblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
    Post findById(long id);
}
