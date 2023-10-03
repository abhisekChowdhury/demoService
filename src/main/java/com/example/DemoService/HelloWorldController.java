package com.example.DemoService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/hello")
public class HelloWorldController {

    //Examples of GetMapping
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World! This is the first endpoint of this application!";
    }

    @GetMapping("/add")
    public int addTwoNumbers(@RequestParam int num1, @RequestParam int num2) {
        return num1 + num2;
    }

    @GetMapping("/items")
    public List<String> getItems() {
        List<String> items = Arrays.asList("Item1", "Item2", "Item3", "Item4");
        return items;
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUserProfile(@PathVariable long id){
        User user = new User(1, "Abhi", "Chowdhury", "abhisek@gmail.com");
        return ResponseEntity.ok(user);
    }
}
