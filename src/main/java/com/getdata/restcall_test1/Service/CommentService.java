package com.getdata.restcall_test1.Service;

import com.getdata.restcall_test1.Entity.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    public Comment createComment(Comment comment) {
        // Implement logic to create a comment
        return commentRepository.save(comment);
    }

    public List<Comment> getCommentsByBookISBN(String ISBN) {
        // Implement logic to get comments for a book
        return commentRepository.findByBookISBN(ISBN);
    }


}
