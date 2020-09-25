package com.mapsa.server.controller;

import com.mapsa.server.data.Request;
import com.mapsa.server.domain.User;
import com.mapsa.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("registering")
public class RegisterController {
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> register(@RequestBody Request request){
        return ResponseEntity.ok(userService.save(request));
    }

    @GetMapping
    public ResponseEntity<List<User>> findAllUser(){
        return ResponseEntity.ok(userService.findAllUser());
    }
}
