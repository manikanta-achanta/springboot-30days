package com.manikanta.springboot_backend.basics;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api_Learning_Protocol {

    // Request Param Example
    @GetMapping("/greet")
    public String greetUser(@RequestParam String name) {
        return "Hello " + name + " 🚀";
    }

    // Path Variable Example
    @GetMapping("/welcome/{name}")
    public String welcomeUser(@PathVariable String name) {
        return "Welcome " + name + " 🎉";
    }
}
