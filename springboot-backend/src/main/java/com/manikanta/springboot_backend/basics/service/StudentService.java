package com.manikanta.springboot_backend.basics.service;

import com.manikanta.springboot_backend.basics.model.Student;
import java.util.List;

import com.manikanta.springboot_backend.basics.model.Student;

import java.util.List;

public interface StudentService {

    String addStudent(Student student);

    List<Student> getAllStudents();

    Student getStudentByID(int id);

    String deleteStudentByID(int id);

    String updateStudentByID(int id, Student updateStudent);
}