package com.example.newapp.service;

import com.example.newapp.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    List<User> getAllUsers();
    User getUserById(int id);
    void updateUser(User user);
    void deleteUser(int id);
}
