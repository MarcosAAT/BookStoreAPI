package com.getdata.restcall_test1.Service;

import com.getdata.restcall_test1.Repository.WishlistsRepo;
import com.getdata.restcall_test1.Entity.User;
import com.getdata.restcall_test1.Entity.Wishlists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
// import java.util.List;

@Service
public class WishlistsService {
    private final WishlistsRepo wishlistsRepo;

    @Autowired
    public WishlistsService(WishlistsRepo wishlistsRepo) {
        this.wishlistsRepo = wishlistsRepo;
    }

    public Wishlists createWishlist(String customName, User userID) {
        Wishlists wishlist = new Wishlists(customName, userID);
        return wishlistsRepo.save(wishlist);
    }
    public Optional<Wishlists> getWishlistById(String WishID) {
        return wishlistsRepo.findById(WishID);
    }

}
