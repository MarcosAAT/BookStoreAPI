package com.getdata.restcall_test1.Service;

import com.getdata.restcall_test1.Repository.WishlistItemsRepo;
import com.getdata.restcall_test1.Entity.Books;
import com.getdata.restcall_test1.Entity.WishlistItems;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
// import java.util.List;

@Service
public class WishlistItemsService {
    private final WishlistItemsRepo wishlistItemsRepo;

    @Autowired
    public WishlistItemsService(WishlistItemsRepo wishlistItemsRepo) {
        this.wishlistItemsRepo = wishlistItemsRepo;
    }

    public WishlistItems addBookItems(Books book) {
        WishlistItems bookItem = new WishlistItems(book);
        return wishlistItemsRepo.save(bookItem);
    }

    // public List<Wishlists> getAllWishlists() {
    //     return WishlistsRepo.findAll();
    // }

    public Optional<WishlistItems> getWishlistById(String WishID) {
        return wishlistItemsRepo.findById(WishID);
    }

    // public List<Wishlists> findWishlistsByCustomName(String customName) {
    //     return WishlistsRepo.findByCustomName(customName);
    // }

    // public void deleteWishlist(String ISBN) { //why static
    //     WishlistsRepo.deleteById(ISBN);
    // }
    
    // revise
}
