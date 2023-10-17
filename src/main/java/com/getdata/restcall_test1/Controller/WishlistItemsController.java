package com.getdata.restcall_test1.Controller;

import com.getdata.restcall_test1.Entity.Books;
import com.getdata.restcall_test1.Entity.WishlistItems;
import com.getdata.restcall_test1.Service.WishlistItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("/wishlistItems")
public class WishlistItemsController {
    private final WishlistItemsService wishlistItemsService;

    @Autowired
    public WishlistItemsController(WishlistItemsService wishlistItemsService) {
        this.wishlistItemsService = wishlistItemsService;
    }

    @PostMapping
    public ResponseEntity<WishlistItems> addBookItems(@RequestBody Books book) {
        WishlistItems addedBook = wishlistItemsService.addBookItems(book);
        return ResponseEntity.ok(addedBook);
    }

    // @GetMapping("/{id}")
    // public ResponseEntity<Wishlists> getWishlistById(@PathVariable String WishID) {
    //     Optional<Wishlists> wishlist = wishlistsService.getWishlistById(WishID);
    //     if (wishlist == null) {
    //         return ResponseEntity.notFound().build();
    //     }
    //     return ResponseEntity.ok(wishlist.get());
    // }

    @GetMapping("/{WishID}")
    public ResponseEntity<WishlistItems> getWishlistById(@PathVariable String WishID) {
        Optional<WishlistItems> optionalWishlist = wishlistItemsService.getWishlistById(WishID);

        // if (optionalWishlist.isPresent()) {
            return ResponseEntity.ok(optionalWishlist.get());
        // } else {
        //     return ResponseEntity.notFound().build();
        // }
    }

    //http://localhost:8080/wishlistItems/U0000000

}
