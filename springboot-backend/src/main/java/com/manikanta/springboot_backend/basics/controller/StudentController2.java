package com.manikanta.springboot_backend.basics.controller;

import com.manikanta.springboot_backend.basics.dto.StudentDTO;
import com.manikanta.springboot_backend.basics.service.StudentService;
import com.manikanta.springboot_backend.basics.model.Student;
import org.springframework.web.bind.annotation.*;
import com.manikanta.springboot_backend.basics.mapper.StudentMapper;


import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController2 {

    private final StudentService studentService;
    public StudentController2(  StudentService studentService)
    {
        this.studentService=studentService;

    }


    @PostMapping
    public String createStudent(@RequestBody Student student)
    {
        return studentService.addStudent(student);

    }

    @GetMapping
    public List<Student> getStudents()
    {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getById(@PathVariable int id)
    {
        return studentService.getStudentByID(id);
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id)
    {
        return studentService.deleteStudentByID(id);
    }

    @PutMapping("/{id}")
    public String updateStudent(@PathVariable int id , @RequestBody Student updateStudent)
    {
        return studentService.updateStudentByID(id,updateStudent);
    }


    @GetMapping("/dto/{id}")
    public StudentDTO getStudentDTO(
            @PathVariable int id)
    {
        Student student =
                studentService.getStudentByID(id);

        return StudentMapper.convertToDTO(student);
    }


}
