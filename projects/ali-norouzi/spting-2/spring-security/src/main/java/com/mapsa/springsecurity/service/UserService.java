package com.mapsa.springsecurity.service;

import com.mapsa.springsecurity.data.jwt.Request;
import com.mapsa.springsecurity.domain.User;
import com.mapsa.springsecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public User save(Request request){
        User user = User.builder().username(request.getUsername()).password(passwordEncoder.encode(request.getPassword())).build();
        return userRepository.save(user);
    }
}
