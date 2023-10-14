package com.getdata.restcall_test1.Repository;

import com.getdata.restcall_test1.Entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, String>{
}
