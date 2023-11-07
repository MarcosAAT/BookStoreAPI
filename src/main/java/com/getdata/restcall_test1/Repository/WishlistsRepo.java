package com.getdata.restcall_test1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.getdata.restcall_test1.Entity.Wishlists;
import java.util.Optional;

public interface WishlistsRepo extends JpaRepository<Wishlists, String>{
    Optional<Wishlists> findById(String WishID);
    // List<Wishlists> deleteWishList(String WishID);
}
