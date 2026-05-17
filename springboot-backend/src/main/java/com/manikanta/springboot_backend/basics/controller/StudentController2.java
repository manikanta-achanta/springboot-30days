package com.manikanta.springboot_backend.basics.controller;

import com.manikanta.springboot_backend.basics.dto.ApiResponse;
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
    public ApiResponse<String> createStudent(@RequestBody Student student)
    {
        String response= studentService.addStudent(student);
        return new ApiResponse<>(
                response,
                201,
                null
        );

    }

    @GetMapping
    public ApiResponse<List<Student>> getStudents()
    {
        List<Student>students = studentService.getAllStudents();
        return new ApiResponse<>(
                "Students fetched successfully",
                200,
                students
        );
    }

    @GetMapping("/{id}")
    public ApiResponse<Student> getById(@PathVariable int id)
    {
        Student student= studentService.getStudentByID(id);
        return  new ApiResponse<>(
                "student fetched successfully",
                201,
                student
        );
    }

    @DeleteMapping("/{id}")
    public ApiResponse<String> deleteStudent(@PathVariable int id)
    {
        String response= studentService.deleteStudentByID(id);
        return new ApiResponse<>(
                response,
                201,
                null
        );
    }

    @PutMapping("/{id}")
    public ApiResponse<String> updateStudent(@PathVariable int id , @RequestBody Student updateStudent)
    {
        String response= studentService.updateStudentByID(id,updateStudent);
        return new ApiResponse<>(
                response,
                201,
                null
        );

    }


    @GetMapping("/dto/{id}")
    public ApiResponse<StudentDTO> getStudentDTO(
            @PathVariable int id)
    {
        Student student =
                studentService.getStudentByID(id);
        StudentDTO dto = StudentMapper.convertToDTO(student);

        return new ApiResponse<>(
                "student fetched successfully",
                200,
                dto
                );
    }


}
