package com.driver.services;

import com.driver.models.*;
import com.driver.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository3;

    public User createUser(String username, String password){

            User newUser = new User();
            newUser.setFirstName("test");
            newUser.setLastName("test");
            newUser.setUsername(username);
            newUser.setPassword(password);

            return userRepository3.save(newUser);


    }

    public void deleteUser(int userId){

        userRepository3.deleteById(userId);

    }

    public User updateUser(Integer id, String password){

        Optional<User> user = userRepository3.findById(id);

        User user2 = user.get();

        user2.setPassword(password);

        return user2;

    }
}
