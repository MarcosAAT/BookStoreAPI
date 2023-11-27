package com.getdata.restcall_test1.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.getdata.restcall_test1.Entity.Books;
import com.getdata.restcall_test1.Entity.WishlistItems;
import java.util.*;

public interface WishlistItemsRepo extends JpaRepository<WishlistItems, String>{
    // List<WishlistItems> findISBNByWishID(String WishID); //the one used
    // Optional<WishlistItems> findBooksById(String WishID);
    //Optional<WishlistItems> findById(String ISBN);
    // List<Wishlists> deleteWishList(String WishID);

    // List<WishlistItems> findByWishID(String wishID);

    List<WishlistItems> findBooksByWishID(String wishID);

    // WishlistItems save(WishlistItems bookItem);
}
