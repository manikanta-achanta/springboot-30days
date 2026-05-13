package com.manikanta.springboot_backend.basics.controller;

import com.manikanta.springboot_backend.basics.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FieldInjectionExample {

    @Autowired
    StudentService studentService;
}
