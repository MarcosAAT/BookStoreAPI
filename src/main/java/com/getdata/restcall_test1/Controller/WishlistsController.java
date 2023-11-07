package com.getdata.restcall_test1.Controller;

import com.getdata.restcall_test1.Entity.Wishlists;
import com.getdata.restcall_test1.Service.WishlistsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("/wishlists")
public class WishlistsController {
    private final WishlistsService wishlistsService;

    @Autowired
    public WishlistsController(WishlistsService wishlistsService) {
        this.wishlistsService = wishlistsService;
    }

    @PostMapping
    public ResponseEntity<Wishlists> createWishlist(@RequestBody String wishlistName) {
        Wishlists createdWishlist = wishlistsService.createWishlist(wishlistName);
        return ResponseEntity.ok(createdWishlist);
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
    public ResponseEntity<Wishlists> getWishlistById(@PathVariable String WishID) {
        Optional<Wishlists> optionalWishlist = wishlistsService.getWishlistById(WishID);
        System.out.println(WishID);

        if (optionalWishlist.isPresent()) {
            return ResponseEntity.ok(optionalWishlist.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    //http://localhost:8080/wishlists/U0000000

}
