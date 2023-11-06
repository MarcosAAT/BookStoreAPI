package com.getdata.restcall_test1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.getdata.restcall_test1.Entity.User;

import java.util.List;

public interface UserRepo extends JpaRepository<User, String> {
    User findByUserID(String userID);
    List<User> findByUsername(String username);
}
