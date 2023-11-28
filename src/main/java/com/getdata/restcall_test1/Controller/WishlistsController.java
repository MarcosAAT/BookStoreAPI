package com.getdata.restcall_test1.Controller;

import com.getdata.restcall_test1.Entity.User;
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

    @PostMapping("/{userID}/addWishlist")
    public ResponseEntity<Wishlists> createWishlist(@RequestBody String wishlistName, @PathVariable User userID) {
        Wishlists createdWishlist = wishlistsService.createWishlist(wishlistName, userID);
        return ResponseEntity.ok(createdWishlist);
    }

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

}
