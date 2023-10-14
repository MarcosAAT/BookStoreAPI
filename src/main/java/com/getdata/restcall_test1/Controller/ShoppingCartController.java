package com.getdata.restcall_test1.Controller;

import com.getdata.restcall_test1.Entity.Books;
import com.getdata.restcall_test1.Service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class ShoppingCartController {

    private final ShoppingCartService shoppingCartService;

    @Autowired
    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    // Retrieve the subtotal of the cart for a specific user.
    @GetMapping("/subtotal/{userId}")
    public Double getCartSubtotal(@PathVariable String userId) {
        return shoppingCartService.getCartSubtotalByUserId(userId);
    }

    // Add a book to the cart for a specific user.
    @PostMapping("/add")
    public void addBookToCart(@RequestParam String userId, @RequestParam String bookId) {
        shoppingCartService.addBookToUserCart(userId, bookId);
    }

    // Retrieve the list of book(s) in the user’s shopping cart.
    @GetMapping("/{userId}/books")
    public List<Books> getBooksInCart(@PathVariable String userId) {
        return shoppingCartService.getBooksInUserCart(userId);
    }

    // Delete a book from the shopping cart instance for that user.
    @DeleteMapping("/{userId}/book/{bookId}")
    public void deleteBookFromCart(@PathVariable String userId, @PathVariable String bookId) {
        shoppingCartService.deleteBookFromUserCart(userId, bookId);
    }

}
