package com.getdata.restcall_test1.Controller;

import com.getdata.restcall_test1.Entity.Books;
import com.getdata.restcall_test1.Entity.User;
import com.getdata.restcall_test1.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/getUser/{Username}")
    public ResponseEntity<List<User>> getUsersByUsername(@PathVariable String Username) {
        List<User> users = userService.getUsersByUsername(Username);
        return ResponseEntity.ok(users);
    }

    @PostMapping("/postUser")
    public User postUser(User user){
        userService.postUser(user);
        return user;
    }

}
