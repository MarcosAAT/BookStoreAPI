package com.getdata.restcall_test1.Controller;


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

    // Endpoint to get books based on a rating value
    @GetMapping("/books/{ratingValue}")
    public ResponseEntity<List<Books>> getBooksByRatingOrHigher(@PathVariable Integer ratingValue){
        List<Books> books = ratingService.getBooksByRatingOrHigher(ratingValue);
        return ResponseEntity.ok(books);
    }

    // If you ever want to get the actual ratings based on a value
    @GetMapping("/{ratingValue}")
    public ResponseEntity<List<Rating>> getRatingsByValue(@PathVariable Integer ratingValue) {
        List<Rating> ratings = ratingService.getRatingsByValue(ratingValue);
        return ResponseEntity.ok(ratings);
    }

    // to search for ratings http://localhost:8080/ratings/books/5
}
