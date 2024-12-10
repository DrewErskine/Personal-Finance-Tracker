package com.peeppea.finance.peeppea_finance_tracker.service;

import com.peeppea.finance.peeppea_finance_tracker.model.User;
import com.peeppea.finance.peeppea_finance_tracker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public Optional<User> getUserById(Long userId) {
        return userRepository.findById(userId);
    }

    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }
}
