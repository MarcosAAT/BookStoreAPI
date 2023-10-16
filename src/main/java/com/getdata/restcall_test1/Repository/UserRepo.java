package com.getdata.restcall_test1.Repository;

import com.getdata.restcall_test1.Entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepo extends JpaRepository<User, String>{

    List<User> findByUsername(String Username);
}
