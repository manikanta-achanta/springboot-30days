package com.manikanta.springboot_backend.basics.exception;

public class StudentNotFoundException
        extends RuntimeException {

    public StudentNotFoundException(String message)
    {
        super(message);
    }
}