package com.vino.Authify.service;

import com.vino.Authify.model.user.User;
import com.vino.Authify.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder bCryptPasswordEncoder;


    public ArrayList<User> getUsers() {
        return (ArrayList<User>) userRepository.findAll();
    }
}
