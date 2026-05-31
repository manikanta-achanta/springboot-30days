package com.manikanta.springboot_backend.basics.dto;

import jakarta.validation.constraints.*;

public class StudentRequestDTO {

    @NotBlank(
            message =
                    "name cannot be empty")
    private String name;

    @Min(
            value = 18,
            message =
                    "age must be at least 18")
    @Max(
            value = 60,
            message =
                    "age cannot exceed 60")
    private int age;

    @Size(
            min = 5,
            message =
                    "password must contain at least 5 characters")
    private String password;

    public StudentRequestDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(
            String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(
            int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(
            String password) {
        this.password = password;
    }
}