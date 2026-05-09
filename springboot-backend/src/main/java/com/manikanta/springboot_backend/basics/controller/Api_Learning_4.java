package com.manikanta.springboot_backend.basics.controller;

import com.manikanta.springboot_backend.basics.model.Product;
import com.manikanta.springboot_backend.basics.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api_Learning_4 {

    @PostMapping("/users")
    public String createUser(@RequestBody User user)
    {
        return "I created this user created: " + user.getName() + " ,age " + user.getAge();
    }

    @PostMapping("/Products")
    public String pro(@RequestBody Product product)
    {
        return "product name is: " + product.getName() + ", price is: " + product.getPrice();
    }


}
