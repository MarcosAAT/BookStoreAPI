package com.getdata.restcall_test1.Repository;

import com.getdata.restcall_test1.Entity.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingCartRepo extends JpaRepository<ShoppingCart, String> {
    ShoppingCart findByUser_UserID(String userId);
}


