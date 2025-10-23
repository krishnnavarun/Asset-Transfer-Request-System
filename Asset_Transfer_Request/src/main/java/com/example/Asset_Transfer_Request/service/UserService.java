package com.example.Asset_Transfer_Request.service;


import com.example.Asset_Transfer_Request.entity.User;
import com.example.Asset_Transfer_Request.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService
{
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    //to get all the users
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    //to save the users
    public User saveUser(User user){
        return userRepository.save(user);
    }
}