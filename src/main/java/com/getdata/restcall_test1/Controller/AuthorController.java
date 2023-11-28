package com.getdata.restcall_test1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.getdata.restcall_test1.Service.AuthorService;
import com.getdata.restcall_test1.Entity.Author;
import com.getdata.restcall_test1.Entity.Books;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
public class AuthorController {

    private AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/getAuthor/{AuthorID}")
    public Author getDetails(@PathVariable String AuthorID){
        return authorService.getAuthorsByID(AuthorID);
    }
    @GetMapping("/getAuthorBooks/{AuthorID}")
    public ResponseEntity<List<Books>> getBooksByAuthor(@PathVariable String AuthorID){
        List<Books> books = authorService.getBooksByAuthorID(AuthorID);
        if (books != null && !books.isEmpty()) {
            return ResponseEntity.ok(books);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping("/createAuthor")
    public ResponseEntity<Void> createAuthor(@RequestBody Author author) {
        authorService.createAuthor(author);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}

//http://localhost:8080/getAuthor/B0000000
//http://localhost:8080/books/isbn/9780743210898