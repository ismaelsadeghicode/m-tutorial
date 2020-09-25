package com.mapsa.server.service;

import com.mapsa.server.data.Request;
import com.mapsa.server.domain.User;
import com.mapsa.server.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User save(Request request){
        assert request != null;
        User user = User.builder().firstName(request.getFirstName()).lastName(request.getLastName()).build();
        return userRepository.save(user);
    }

    public List<User> findAllUser() {
        return userRepository.findAll();
    }
}
