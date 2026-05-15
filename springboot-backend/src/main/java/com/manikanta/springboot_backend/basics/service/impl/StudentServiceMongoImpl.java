package com.manikanta.springboot_backend.basics.service.impl;

import com.manikanta.springboot_backend.basics.dto.StudentDTO;
import com.manikanta.springboot_backend.basics.model.Student;
import com.manikanta.springboot_backend.basics.service.StudentService;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceMongoImpl implements StudentService {

    @Override
    public String addStudent(Student student) {
        return "Student added using Mongo service";
    }

    @Override
    public List<Student> getAllStudents() {
        return List.of();
    }

    @Override
    public Student getStudentByID(int id) {
        return null;
    }

    @Override
    public String deleteStudentByID(int id) {
        return "Deleted using Mongo service";
    }

    @Override
    public String updateStudentByID(
            int id,
            Student updateStudent) {

        return "Updated using Mongo service";
    }


}