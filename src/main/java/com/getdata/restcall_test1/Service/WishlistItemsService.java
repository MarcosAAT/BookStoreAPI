package com.getdata.restcall_test1.Service;

import com.getdata.restcall_test1.Repository.WishlistItemsRepo;
import com.getdata.restcall_test1.Entity.Books;
import com.getdata.restcall_test1.Entity.WishlistItems;
import com.getdata.restcall_test1.Entity.Wishlists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
// import java.util.List;

@Service
public class WishlistItemsService {
    private final WishlistItemsRepo wishlistItemsRepo;

    @Autowired
    public WishlistItemsService(WishlistItemsRepo wishlistItemsRepo) {
        this.wishlistItemsRepo = wishlistItemsRepo;
    }

    public WishlistItems addBookItems(Books book, String WishID) {
        WishlistItems bookItem = new WishlistItems(book, WishID);
        return wishlistItemsRepo.save(bookItem);
    }//add book

    // public List<Wishlists> getAllWishlists() {
    //     return WishlistsRepo.findAll();
    // }

    // public Optional<WishlistItems> getWishlistById(String WishID) {
    //     return wishlistItemsRepo.findBooksById(WishID);
    // }

    // public List<WishlistItems> getWishlistBooksById(String WishID) {
    //     return wishlistItemsRepo.findISBNByWishID(WishID);
    // } //the one used

    // public List<WishlistItems> getWishlistItemsByWishID(String wishID) {
    //     return wishlistItemsRepo.findByWishID(wishID);
    // }

    public List<WishlistItems> getBooksByWishID(String wishID) {
        return wishlistItemsRepo.findBooksByWishID(wishID);
    }

    // public List<Wishlists> findWishlistsByCustomName(String customName) {
    //     return WishlistsRepo.findByCustomName(customName);
    // }

    // public void deleteWishlist(String ISBN) { //why static
    //     WishlistsRepo.deleteById(ISBN);
    // }
    
    // revise
}
