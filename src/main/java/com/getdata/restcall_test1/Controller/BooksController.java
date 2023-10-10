package com.getdata.restcall_test1.Controller;

import com.getdata.restcall_test1.Entity.Books;
import com.getdata.restcall_test1.Service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {

    @Autowired
    private BooksService booksService;

    @GetMapping("/{genre}")
    public ResponseEntity<List<Books>> getBooksByGenre(@PathVariable String genre) {
        List<Books> books = booksService.getBooksByGenre(genre);
        return ResponseEntity.ok(books);
    }

    @GetMapping("/Best Sellers")
    public ResponseEntity<List<Books>> getBestSellingBooks() {
        List<Books> books = booksService.getBestSellingBooks();
        return ResponseEntity.ok(books);
    }

    //http://localhost:8080/books/Fantasy    for genre
    //http://localhost:8080/books/Best Seller   for best-seller

}




































