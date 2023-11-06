package com.getdata.restcall_test1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.getdata.restcall_test1.Entity.ShoppingCart;

import java.util.List;

public interface ShoppingCartRepo extends JpaRepository<ShoppingCart, String> {
    ShoppingCart findByUser_UserID(String userID);
}
