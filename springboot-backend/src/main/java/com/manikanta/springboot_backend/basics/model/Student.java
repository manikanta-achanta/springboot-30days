package com.manikanta.springboot_backend.basics.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message="name cannot be empty")
    private  String name;

    @Min(value=18, message="age must be at least 18")
    @Max(value = 60,message = "age must be less then 60")
    private  int age;


    @Size(min = 5,message = "password must contain at least 5 characters")
    private String password;

    public Student()
    {

    }


  public Student(int id,String name,int age,String password)
  {
      this.id=id;
      this.name=name;
      this.age=age;
      this.password=password;
  }

  public int getId()
  {
      return id;
  }

  public  void setId(int id)
  {
      this.id=id;
  }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
        this.password=password;
    }


}
