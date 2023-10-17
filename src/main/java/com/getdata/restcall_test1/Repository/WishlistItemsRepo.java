package com.getdata.restcall_test1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.getdata.restcall_test1.Entity.WishlistItems;
import java.util.Optional;

public interface WishlistItemsRepo extends JpaRepository<WishlistItems, String>{
    Optional<WishlistItems> findById(String ISBN);
    // List<Wishlists> deleteWishList(String WishID);
}
