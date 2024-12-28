package com.telusko.spring_sec_demo.service;

import com.telusko.spring_sec_demo.controller.UserController;
import com.telusko.spring_sec_demo.dao.UserRepo;
import com.telusko.spring_sec_demo.model.Student;
import com.telusko.spring_sec_demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public User saveUser(User user){

        return userRepo.save(user);
    }

}
