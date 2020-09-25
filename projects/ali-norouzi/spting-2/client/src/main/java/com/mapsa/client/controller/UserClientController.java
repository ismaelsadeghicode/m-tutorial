package com.mapsa.client.controller;

import com.mapsa.client.client.UserRegisteringClient;
import com.mapsa.client.client2.UserRegisteryClient2;
import com.mapsa.client.data.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("client")
public class UserClientController {
    /*@Autowired
    private UserRegisteringClient registeringClient;*/
    @Autowired
    private UserRegisteryClient2 userRegisteryClient2;

    @GetMapping
    public List<User> findAll(){
        return userRegisteryClient2.findAllUser();
    }

    @PostMapping
    public ResponseEntity<User> save(@RequestBody User user) throws URISyntaxException {
        return ResponseEntity.ok(userRegisteryClient2.register(user));
    }
}
