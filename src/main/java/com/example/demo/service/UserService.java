package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAllUser();

    void saveUser(User user);

    void deleteUser(Long id);
    void updateUser(User user);


    User findUserById(Long id);

    List<User> findUserByName(String name);
    List<User>findByEmail(String Email);



    List<User> findByPhone(int phone);
}