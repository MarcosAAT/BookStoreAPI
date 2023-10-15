package com.getdata.restcall_test1.Controller;


import com.getdata.restcall_test1.Entity.Comment;
import com.getdata.restcall_test1.Entity.Rating;
import com.getdata.restcall_test1.Service.RatingService;
import com.getdata.restcall_test1.Entity.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @Autowired
    private RatingService ratingService;


    @GetMapping("/books/{ratingValue}")
    public ResponseEntity<List<Books>> getBooksByRatingOrHigher(@PathVariable Integer ratingValue){
        List<Books> books = ratingService.getBooksByRatingOrHigher(ratingValue);
        return ResponseEntity.ok(books);
    }


    @GetMapping("/{ratingValue}")
    public ResponseEntity<List<Rating>> getRatingsByValue(@PathVariable Integer ratingValue) {
        List<Rating> ratings = ratingService.getRatingsByValue(ratingValue);
        return ResponseEntity.ok(ratings);
    }
    @PostMapping
    public ResponseEntity<Comment> createComment(@RequestBody Comment comment) {
        Comment createdComment = commentService.createComment(comment);
        return ResponseEntity.ok(createdComment);
    }

    @GetMapping("/book/{ISBN}")
    public ResponseEntity<List<Comment>> getCommentsByBook(@PathVariable String ISBN) {
        List<Comment> comments = commentService.getCommentsByBookISBN(ISBN);
        return ResponseEntity.ok(comments);
    }


    // to search for ratings http://localhost:8080/ratings/books/5
}
