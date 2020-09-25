package com.mapsa.client.client2;

import com.mapsa.client.data.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(name = "WEB-SERVER-SERVICE")
public interface UserRegisteryClient2 {

    @GetMapping("/registering")
    List<User> findAllUser();

    @PostMapping("/registering")
    User register(User user);

}
