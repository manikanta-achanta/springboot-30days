package com.manikanta.springboot_backend.basics;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api_Learning_1 {

    @GetMapping("/name")
    public String getName()
    {
        return "my name is Manikanta";
    }

    @GetMapping("/status")
    public String getStatus()
    {
        return "server is working correctly";
    }


}
