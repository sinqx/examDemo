package com.exam2.demo.controller;

import com.exam2.demo.entity.User;
import com.exam2.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping
    public User save(@RequestBody User user) {
        return userService.save(user);
    }

    @GetMapping("/{userId}")
    public User getById(@PathVariable Long userId){
        return userService.findById(userId);
    }

    @GetMapping("/get-name")
    public String getName(Principal principal){
        return principal.getName();
    }

    @DeleteMapping("/{userId}")
    public User deleteById(@PathVariable Long userId){
        return userService.deleteById(userId);
    }
}
