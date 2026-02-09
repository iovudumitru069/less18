package com.impact.lessons.controllers;

import com.impact.lessons.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final UserService userService = new UserService();

    @PostMapping("/users/create")
    public User = CreateUser(@RequestBody User user){
        return userService.createUser(user);
    }
    @GetMapping("users/get_all")
    public List<User> GetAllUsers(){
        return usserService.getAllUsers();

    }
}
