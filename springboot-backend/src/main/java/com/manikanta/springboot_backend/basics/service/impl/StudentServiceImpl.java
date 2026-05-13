package com.manikanta.springboot_backend.basics.service.impl;

import com.manikanta.springboot_backend.basics.model.Student;
import com.manikanta.springboot_backend.basics.service.StudentService;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
// Prototype scope creates new object every time
@Scope("Prototype")
@Primary
public class StudentServiceImpl implements StudentService {

    private final List<Student> students = new ArrayList<>();

    @Override
    public String addStudent(Student student)
    {
        students.add(student);
        return "student added successfully";
    }

    @Override
    public List<Student> getAllStudents()
    {
        return students;
    }

    @Override
    public Student getStudentByID(int id)
    {
        for(Student student : students)
        {
            if(student.getId() == id)
            {
                return student;
            }
        }

        return null;
    }

    @Override
    public String deleteStudentByID(int id)
    {
        for(Student student : students)
        {
            if(student.getId() == id)
            {
                students.remove(student);
                return "student deleted successfully";
            }
        }

        return "student not found";
    }

    @Override
    public String updateStudentByID(
            int id,
            Student updateStudent)
    {
        for(Student student : students)
        {
            if(student.getId() == id)
            {
                student.setName(updateStudent.getName());
                student.setAge(updateStudent.getAge());

                return "student updated successfully";
            }
        }

        return "student not found";
    }
}
