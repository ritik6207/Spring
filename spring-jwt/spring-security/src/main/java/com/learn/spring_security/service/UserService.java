package com.learn.spring_security.service;

import com.learn.spring_security.dao.UserRepo;
import com.learn.spring_security.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;

    public User saveUser(User user){
        return repo.save(user);
    }
}
