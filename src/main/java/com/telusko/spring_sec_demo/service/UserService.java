package com.telusko.spring_sec_demo.service;

import com.telusko.spring_sec_demo.controller.UserController;
import com.telusko.spring_sec_demo.dao.UserRepo;
import com.telusko.spring_sec_demo.model.Student;
import com.telusko.spring_sec_demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;
    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    public User saveUser(User user){

        user.setPassword(encoder.encode(user.getPassword()));
        System.out.println(user.getPassword());

        return userRepo.save(user);
    }

    public String login(User user) {
        return null;
    }
}
