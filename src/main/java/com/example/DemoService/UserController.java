package com.example.DemoService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    //Examples of a UserController

    // Storage for user mock data - //TODO: Put into json somewhere else
    private List<User> users = new ArrayList<>();

    // Constructor to initialize some sample users
    public UserController() {
        users.add(new User(1, "Abhi", "Chowdhury", "abhisek.chowdhury@email.com"));
        users.add(new User(2, "Rika", "Majumdar", "rika@fuff.com"));
        users.add(new User(3, "Mukesh", "Samant", "mukesh@badididi.com" ));
        users.add(new User(4, "Milan", "Mukherjee", "mukherjee@debaroti.com"));
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUserById(@PathVariable int id) {
        User user = findUserById(id);

        if (user != null) {
            return ResponseEntity.ok(user);
        }
        return ResponseEntity.notFound().build();
    }


    //TODO: Fix this api
    @GetMapping("/user-by-name/{firstName}")
    public ResponseEntity<User> getUserByFirstName(@PathVariable String firstName){
        User user = findUserByFirstName(firstName);

        if (user != null) {
            return ResponseEntity.ok(user);
        }
        return ResponseEntity.notFound().build();
    }

    private User findUserByFirstName(String firstName) {
        for (User user : users) {
            if (user.getFirstName() == firstName) {
                return user;
            }
        }
        return null;
    }

    private User findUserById(int id) {
            for (User user : users) {
                if (user.getId() == id) {
                    return user;
                }
            }
        return null;
    }
}
