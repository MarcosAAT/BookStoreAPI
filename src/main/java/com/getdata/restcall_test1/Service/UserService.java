package com.getdata.restcall_test1.Service;

import com.getdata.restcall_test1.Entity.*;
import com.getdata.restcall_test1.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public List<User> getUsersByUsername(String Username){
        return userRepo.findByUsername(Username);
    }

    public User postUser(User user){
        userRepo.save(user);
        return user;
    }
}
