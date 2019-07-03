package com.putact.controller;

import com.putact.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieContorller {

    @Value("user.url")
    private String userUrl;
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/user/{id}")
    public User findByid(@PathVariable Long id){
        return this.restTemplate.getForObject(userUrl + id, User.class);
    }

}
