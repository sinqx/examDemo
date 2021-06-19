package com.exam2.demo.service;

import com.exam2.demo.entity.User;
import com.exam2.demo.repository.RequestsPerository;
import com.exam2.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl  implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RequestsService requestsService;

    @Override
    public User save(User user) {
        requestsService.save("POST");
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        requestsService.save("GET");
        return userRepository.findAll();
    }

    @Override
    public User findById(Long id) {
        requestsService.save("GET");
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User deleteById(Long id) {
        requestsService.save("DELETE");
        User user = findById(id);
        if (user != null) {
            userRepository.delete(user);
            return user;
        }
        return null;
    }
}
