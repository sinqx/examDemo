package com.exam2.demo.service;

import com.exam2.demo.entity.User;

import java.util.List;

public interface UserService {
    User save(User user);
    List<User> getAllUsers();
    User findById(Long id);
    User deleteById(Long id);
}
