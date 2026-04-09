package com.example.chatappdemo.controller;


import com.example.chatappdemo.entity.User;
import com.example.chatappdemo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ApiController {

    private final UserService userService;

    @GetMapping("/online-users")
    public List<User> getOnlineUsers() {
        return userService.getOnlineUsers();
    }
}
