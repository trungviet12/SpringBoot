package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired private UserService userService;

    @GetMapping(value = "user")
    public List<User> index() {
        List<User> users = userService.getAllUser();
        return users;
    }

    @PostMapping(value = "user")
    public void addUser(@RequestBody User user) {
        userService.saveUser(user);
    }

    @PutMapping(value = "user")
    public User updateUser (@RequestParam("userId") Long userId){
        //TODO find User by Id;
        User u = userService.findUserById(userId);
        //TODO update user
        userService.updateUser(u);
        return u;
    }

    @GetMapping(value = "viet")
    public List<User> selectUser (@RequestParam("userName") String userName){
        List<User> users = userService.findUserByName(userName);
        return users;
    }
    @GetMapping (value = "viet1")
    public List<User> selectUser1 (@RequestParam("userEmail")String userEmail){
        List<User> user =userService.findByEmail(userEmail);
        return user;

    }
    @GetMapping (value = "viet2")
    public List<User> selectUser2 (@RequestParam("userPhone")int userPhone){
        List<User> user = userService.findByPhone(userPhone);
        return user;
    }


}
