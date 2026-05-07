package com.manikanta.springboot_backend.basics;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Api_Learning_3 {

    @GetMapping("/student")
    public String student(@RequestParam String name,@RequestParam int age)
    {
        return "my name is: " + name +", age is: " + age;
    }

    @GetMapping("/country")
    public String country(@RequestParam(defaultValue = "India") String name)
    {
        return "country: "+name;
    }

    @GetMapping("/search")
    public String search(@RequestParam(required = false) String keyword) {

        if (keyword == null) {
            return "No keyword provided";
        }

        return "Searching for: " + keyword;
    }


}
