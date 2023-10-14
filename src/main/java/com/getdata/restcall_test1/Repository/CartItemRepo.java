package com.getdata.restcall_test1.Repository;

import com.getdata.restcall_test1.Entity.CartItem;
import com.getdata.restcall_test1.Entity.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartItemRepo extends JpaRepository<CartItem, String> {
    List<CartItem> findByCart_User_UserID(String userId);
    CartItem findByCartAndBookId(ShoppingCart cart, String bookId);

}