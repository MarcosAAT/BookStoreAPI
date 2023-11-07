package com.getdata.restcall_test1.Controller;

import com.getdata.restcall_test1.Service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.getdata.restcall_test1.Entity.Books;
import java.util.List;

@RestController
@RequestMapping("/shoppingCart")
public class ShoppingCartController {

    private final ShoppingCartService shoppingCartService;

    @Autowired
    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    // Retrieve the subtotal price of all items in the user’s shopping cart.
    @GetMapping("/subtotal")
    public ResponseEntity<Double> getCartSubtotalByUserId(@RequestParam String userId) {
        try {
            Double subtotal = shoppingCartService.getCartSubtotalByUserId(userId);
            return new ResponseEntity<>(subtotal, HttpStatus.OK);
        } catch (Exception e) {
            // Handle exception, e.g., log it, and return a response
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Add a book to the shopping cart.
    @PostMapping("/addBook")
    public ResponseEntity<Void> addToUserCart(@RequestParam String userId, @RequestParam String bookId) {
        try {
            shoppingCartService.addToUserCart(userId, bookId);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            // Handle exception, e.g., log it, and return a response
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Retrieve the list of book(s) in the user’s shopping cart.
    @GetMapping("/books")
    public ResponseEntity<List<Books>> getBooksInUserCart(@RequestParam String userId) {
        try {
            List<Books> books = shoppingCartService.getBooksInUserCart(userId);
            return new ResponseEntity<>(books, HttpStatus.OK);
        } catch (Exception e) {
            // Handle exception, e.g., log it, and return a response
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Delete a book from the shopping cart.
    @DeleteMapping("/removeBook")
    public ResponseEntity<Void> removeBookFromUserCart(@RequestParam String userId, @RequestParam String bookId) {
        try {
            shoppingCartService.removeBookFromUserCart(userId, bookId);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            // Handle exception, e.g., log it, and return a response
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}


