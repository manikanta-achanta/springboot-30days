package com.manikanta.springboot_backend.basics.controller;

import com.manikanta.springboot_backend.basics.model.ApiResponse;

import com.manikanta.springboot_backend.basics.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Api_Learning_5 {

    @PostMapping("/sample")
    public ResponseEntity<ApiResponse> createUser(@RequestBody User user)
    {
        ApiResponse response = new ApiResponse("user created successfully", 201);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
