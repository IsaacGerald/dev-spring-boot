package com.telusko.spring_boot_rest.service;

import com.telusko.spring_boot_rest.repo.UserRepo;
import com.telusko.spring_boot_rest.model.User;
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

}
