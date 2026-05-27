package com.manikanta.springboot_backend.basics.service.impl;

import com.manikanta.springboot_backend.basics.exception.StudentNotFoundException;
import com.manikanta.springboot_backend.basics.model.Student;
import com.manikanta.springboot_backend.basics.repository.StudentRepository;
import com.manikanta.springboot_backend.basics.service.StudentService;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
// Prototype scope creates new object every time
//@Scope("prototype")
@Primary
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    public StudentServiceImpl(StudentRepository studentRepository)
    {
        this.studentRepository=studentRepository;
    }

    @Override
    public String addStudent(Student student)
    {
        studentRepository.save(student);
        return "student added successfully";
    }

    @Override
    public List<Student> getAllStudents()
    {
        return studentRepository.findAll();
    }

    @Override
    public void SaveAllStudents(List<Student> students)
    {
        studentRepository.saveAll(students);
    }


    @Override
    public Student getStudentByID(int id)
    {
        return studentRepository.findById(id).orElse(null);
    }


    @Override
    public String deleteStudentByID(int id)
    {
        boolean exists= studentRepository.existsById(id);
        if(!exists)
        {
            return "student not found";

        }
        studentRepository.deleteById(id);
        return "student deleted successfully";
    }


    @Override
    public String updateStudentByID(
            int id,
            Student updateStudent)
    {
        Student existingStudent = studentRepository.findById(id).orElse(null);
        if(existingStudent==null)
        {
            throw new StudentNotFoundException(
                    "student not found with id: " + id
            );
        }
        existingStudent.setName(
                updateStudent.getName());

        existingStudent.setAge(
                updateStudent.getAge());

        existingStudent.setPassword(
                updateStudent.getPassword());

        studentRepository.save(existingStudent);

        return "student updated successfully";
    }

    @Override
    public List<Student> StudentGetByName(String name)
    {
        return studentRepository.findByName(name);


    }

    @Override
    public List<Student> StudentGetByAge(int age)
    {
        return studentRepository.findByAge(age);
    }

    @Override
    public List<Student> StudentGetByNameAge(String name,int age)
    {
        return studentRepository.findByNameAndAge(name,age);
    }

    @Override
    public List<Student> searchStudentsByName(
            String keyword)
    {
        return studentRepository
                .findByNameContaining(keyword);
    }

    @Override
    public List<Student> getStudentsAboveAge(
            int age)
    {
        return studentRepository
                .findByAgeGreaterThan(age);
    }


    @Override
    public Page<Student> getStudentsWithPagination(
            int page,
            int size)
    {
        Pageable pageable =
                PageRequest.of(page, size);

        return studentRepository.findAll(pageable);
    }

}
