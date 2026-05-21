package com.manikanta.springboot_backend.basics.repository;

import com.manikanta.springboot_backend.basics.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {

    List<Student> findByName(String name);
    List<Student> findByAge(int age);
    List<Student> findByNameAndAge(String name,int age);
}
