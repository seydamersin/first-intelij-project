package com.muates.example1.srp.service;

import com.muates.example1.srp.model.User;

public class UserServiceImpl implements IUserService {

    @Override
    public User createUser() {
        User user1 = new User();
        user1.setUsername("murat");
        user1.setEmail("murat@example.com");
        user1.setPw("12345");

        return user1;
    }

    @Override
    public User getUser() {
        User user1 = createUser();
        return user1;
    }
}
