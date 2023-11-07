package com.getdata.restcall_test1.Repository;

import com.getdata.restcall_test1.Entity.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.getdata.restcall_test1.Entity.CartItem;
import java.util.List;

public interface CartItemRepo extends JpaRepository<CartItem, String> {
    List<CartItem> findByCart_UserID(String userID);
    CartItem findByCartAndBookId(ShoppingCart cart, String bookID);
}

