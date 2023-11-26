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

    @GetMapping("/genre/{genre}")
    public ResponseEntity<List<Books>> getBooksByGenre(@PathVariable String genre) {
        List<Books> books = booksService.getBooksByGenre(genre);
        return ResponseEntity.ok(books);
    }

    @GetMapping("/best-sellers")
    public ResponseEntity<List<Books>> getBestSellingBooks() {
        List<Books> books = booksService.getBestSellingBooks();
        return ResponseEntity.ok(books);
    }

    @PutMapping("/update-prices/{publisher}/{discountPercent}")
    public ResponseEntity<Void> updateBookPrices(
            @PathVariable String publisher,
            @PathVariable double discountPercent
    ) {
        booksService.updateBookPrices(publisher, discountPercent);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/isbn/{isbn}")
    public ResponseEntity<Books> getBookByISBN(@PathVariable String isbn) {
        Books book = booksService.getBookByISBN(isbn);
        if (book != null) {
            return ResponseEntity.ok(book);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}



//http://localhost:8080/books/Fantasy    for genre
//http://localhost:8080/books/Best Sellers   for best-seller
//http://localhost:8080/books/publisher/discount?publisher=Bantam&discountPercent=5     discount for publisher
//http://localhost:8080/books/Vintage/5               a more simple way to update price
//GET http://localhost:8080/books/isbn/9780743210898 for isbn



    //http://localhost:8080/books/genre/Fantasy    for genre
    //http://localhost:8080/books/best-sellers   for best-seller
    //http://localhost:8080/books/publisher/discount?publisher=Bantam&discountPercent=5     discount for publisher
    //http://localhost:8080/books/Vintage/5               a more simple way to update price
    //GET http://localhost:8080/books/isbn/9780743210898 for isbn





































