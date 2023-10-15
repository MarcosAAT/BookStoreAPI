package com.getdata.restcall_test1.Repository;

import com.getdata.restcall_test1.Entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepo extends JpaRepository<Comment, Long> {
    List<Comment> findByBookISBN(String ISBN);

}