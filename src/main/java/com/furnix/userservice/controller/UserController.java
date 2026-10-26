package com.furnix.userservice.controller;

import com.furnix.userservice.record.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public ResponseEntity<User> getUsers(){
        User user = new User(101L,"Ravi");
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
