package com.getdata.restcall_test1.Controller;

import com.getdata.restcall_test1.Entity.Books;
import com.getdata.restcall_test1.Entity.WishlistItems;
import com.getdata.restcall_test1.Entity.Wishlists;
import com.getdata.restcall_test1.Service.WishlistItemsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/wishlistItems")
public class WishlistItemsController {
    private final WishlistItemsService wishlistItemsService;

    @Autowired
    public WishlistItemsController(WishlistItemsService wishlistItemsService) {
        this.wishlistItemsService = wishlistItemsService;
    }

    @PostMapping
    public ResponseEntity<WishlistItems> addBookItems(@RequestBody Books book, @RequestParam String WishID) {
        WishlistItems addedBook = wishlistItemsService.addBookItems(book, WishID);
        return ResponseEntity.ok(addedBook);
    }// add book

    // @GetMapping("/{id}")
    // public ResponseEntity<Wishlists> getWishlistById(@PathVariable String WishID) {
    //     Optional<Wishlists> wishlist = wishlistsService.getWishlistById(WishID);
    //     if (wishlist == null) {
    //         return ResponseEntity.notFound().build();
    //     }
    //     return ResponseEntity.ok(wishlist.get());
    // }

    // @GetMapping("/{WishID}/books")
    // public ResponseEntity<WishlistItems> getWishlistBooksById(@PathVariable String WishID) {
    //     Optional<WishlistItems> optionalWishlist = wishlistItemsService.getWishlistById(WishID);

    //     // if (optionalWishlist.isPresent()) {
    //         return ResponseEntity.ok(optionalWishlist.get());
    //     // } else {
    //     //     return ResponseEntity.notFound().build();
    //     // }
    // } // doesnt work for multiple books

    // @GetMapping("/{WishID}/books")
    // public ResponseEntity<List<WishlistItems>> getWishlistBooksById(@PathVariable String WishID) {
    //     List<WishlistItems> books = wishlistItemsService.getWishlistBooksById(WishID);

    //     if (books.isEmpty()) {
    //         return ResponseEntity.notFound().build();
    //     }
    //     return ResponseEntity.ok(books);
    // } //the one used before
    
    @GetMapping("/{wishID}/books")
    public ResponseEntity<List<Books>> getWishlistItemsByWishID(@PathVariable String wishID) {
        List<Books> books = wishlistItemsService.getBooksByWishID(wishID);
    
        if (books.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(books);
    }

    //http://localhost:8080/wishlistItems/U0000000

}
