package com.getdata.restcall_test1.Service;

import com.getdata.restcall_test1.Repository.WishlistsRepo;
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

    public Wishlists createWishlist(String customName) {
        Wishlists wishlist = new Wishlists(customName);
        return wishlistsRepo.save(wishlist);
    }

    // public List<Wishlists> getAllWishlists() {
    //     return WishlistsRepo.findAll();
    // }

    public Optional<Wishlists> getWishlistById(String ISBN) {
        return wishlistsRepo.findById(ISBN);
    }

    // public List<Wishlists> findWishlistsByCustomName(String customName) {
    //     return WishlistsRepo.findByCustomName(customName);
    // }

    // public void deleteWishlist(String ISBN) { //why static
    //     WishlistsRepo.deleteById(ISBN);
    // }
    
    // revise
}
