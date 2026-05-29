package com.manikanta.springboot_backend.basics.service;

import com.manikanta.springboot_backend.basics.dto.StudentDTO;
import com.manikanta.springboot_backend.basics.model.Student;
import org.springframework.data.domain.Page;

import java.util.List;



public interface StudentService {

    String addStudent(Student student);

    void SaveAllStudents(List<Student> students);

    List<Student> getAllStudents();

    Student getStudentByID(int id);

    String deleteStudentByID(int id);

    String updateStudentByID(int id, Student updateStudent);

    List<Student> StudentGetByName(String name);

    List<Student> StudentGetByAge(int age);

    List<Student> StudentGetByNameAge(String name ,int age);

    List<Student> searchStudentsByName(
            String keyword);

    List<Student> getStudentsAboveAge(
            int age);

    Page<Student> getStudentsWithPagination(
            int page,
            int size);

}