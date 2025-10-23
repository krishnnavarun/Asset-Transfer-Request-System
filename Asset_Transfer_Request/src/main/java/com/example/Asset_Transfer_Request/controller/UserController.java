package com.example.Asset_Transfer_Request.controller;


import org.springframework.web.bind.annotation.*;
import com.example.Asset_Transfer_Request.entity.User;
import com.example.Asset_Transfer_Request.service.UserService;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController
{
    private final UserService userService;

    public UserController(UserService userService)
    
    {
        this.userService = userService;
    }

    //to get all users available in the database
    @GetMapping
    public List<User> getAllUsers()
    {
        return userService.getAllUsers();
    }

    //to add users to the database
    @PostMapping
    public User createUser(@RequestBody User user)
    {
        return userService.saveUser(user);
    }
}
