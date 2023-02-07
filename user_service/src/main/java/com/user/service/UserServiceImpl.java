package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    //fake user list

    List<User> list = List.of(
            new User(1311L, "one", "23525625"),
            new User(1312L, "two", "99999"),
            new User(1314L, "three", "888")
    );

    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}