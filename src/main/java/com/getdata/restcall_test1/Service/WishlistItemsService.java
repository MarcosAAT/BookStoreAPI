package com.getdata.restcall_test1.Service;

import com.getdata.restcall_test1.Repository.WishlistItemsRepo;
import com.getdata.restcall_test1.Entity.Books;
import com.getdata.restcall_test1.Entity.WishlistItems;
import com.getdata.restcall_test1.Entity.Wishlists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
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

    public List<WishlistItems> getBooksByWishID(String wishID) {
        return wishlistItemsRepo.findBooksByWishID(wishID);
    }

    public void deleteWishlistItemById(String wishID, Books book) {
        Optional<WishlistItems> optionalWishlistItem = wishlistItemsRepo.findTopByWishIDAndISBN(wishID, book);

        if (optionalWishlistItem.isPresent()) {
            wishlistItemsRepo.delete(optionalWishlistItem.get());
        } else {
            //throw new NotFoundException("Wishlist item not found for wishID: " + wishID + " and ISBN: " + book.getISBN());
        }
    }

}
