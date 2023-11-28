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

    @PostMapping("/{wishID}/addBook/{book}")
    public ResponseEntity<WishlistItems> addBookItems(@PathVariable Books book, @PathVariable String wishID) {
        WishlistItems addedBook = wishlistItemsService.addBookItems(book, wishID);
        return ResponseEntity.ok(addedBook);
    }// add book

    @DeleteMapping("/{wishID}/removeBook/{book}")
    public ResponseEntity<Void> deleteWishlistItem(@PathVariable Books book, @PathVariable String wishID) {
        wishlistItemsService.deleteWishlistItemById(wishID, book);

        return ResponseEntity.noContent().build();
    }
    
    @GetMapping("/{wishID}/books")
    public ResponseEntity<List<WishlistItems>> getWishlistItemsByWishID(@PathVariable String wishID) {
        List<WishlistItems> books = wishlistItemsService.getBooksByWishID(wishID);
    
        if (books.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(books);
    }

    //http://localhost:8080/wishlistItems/U0000000

}
