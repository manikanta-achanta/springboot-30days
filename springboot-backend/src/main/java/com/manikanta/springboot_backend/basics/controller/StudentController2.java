package com.manikanta.springboot_backend.basics.controller;

import com.manikanta.springboot_backend.basics.dto.ApiResponse;
import com.manikanta.springboot_backend.basics.dto.StudentDTO;
import com.manikanta.springboot_backend.basics.service.StudentService;
import com.manikanta.springboot_backend.basics.model.Student;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import com.manikanta.springboot_backend.basics.mapper.StudentMapper;
import org.springframework.http.ResponseEntity;


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
    public ResponseEntity<ApiResponse<String>>
    createStudent(
            @Valid
            @RequestBody Student student)
    {
        String response =
                studentService.addStudent(student);

        ApiResponse<String> apiResponse =
                new ApiResponse<>(
                        response,
                        201,
                        null
                );

        return ResponseEntity
                .status(201)
                .body(apiResponse);
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
    public ResponseEntity<
            ApiResponse<StudentDTO>>
    getStudentById(
            @PathVariable int id)
    {
        Student student =
                studentService
                        .getStudentByID(id);

        StudentDTO dto =
                StudentMapper
                        .convertToDTO(student);

        ApiResponse<StudentDTO> response =
                new ApiResponse<>(
                        "student fetched successfully",
                        200,
                        dto
                );

        return ResponseEntity.ok(response);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<
            ApiResponse<String>>
    deleteStudent(
            @PathVariable int id)
    {
        String response =
                studentService
                        .deleteStudentByID(id);

        ApiResponse<String> apiResponse =
                new ApiResponse<>(
                        response,
                        200,
                        null
                );

        return ResponseEntity.ok(apiResponse);
    }



    @PutMapping("/{id}")
    public ResponseEntity<
            ApiResponse<String>>
    updateStudent(
            @PathVariable int id,
            @Valid
            @RequestBody Student updateStudent)
    {
        String response =
                studentService
                        .updateStudentByID(
                                id,
                                updateStudent);

        ApiResponse<String> apiResponse =
                new ApiResponse<>(
                        response,
                        200,
                        null
                );

        return ResponseEntity.ok(apiResponse);
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

    @GetMapping("/search/name/{name} ")
    public ApiResponse<List<Student>> StudentgetByName(@PathVariable String name)
    {
        List<Student> students=studentService.StudentGetByName(name);

        return new ApiResponse<>(
                "Students fetched successfully",
                200,
                students
        );
    }

    @GetMapping("/search/age/{age}")
    public ApiResponse<List<Student>>StudentGetByAge( @PathVariable int age)
    {
        List<Student> students=studentService.StudentGetByAge(age);
        return new ApiResponse<>("Student fetched successfully",
                200,
                students);

    }

    @GetMapping("/search/{name}/{age}")
    public ApiResponse<List<Student>> StudentGetByNameAge(@PathVariable String name,@PathVariable int age)
    {
        List<Student> students=studentService.StudentGetByNameAge(name,age);
        return  new ApiResponse<>("Students fetched successfully",
                200,
                students);
    }


    @GetMapping("/search/keyword/{keyword}")
    public ApiResponse<List<Student>>
    searchStudentsByKeyword(
            @PathVariable String keyword)
    {
        List<Student> students =
                studentService
                        .searchStudentsByName(keyword);

        return new ApiResponse<>(
                "students fetched successfully",
                200,
                students
        );
    }


    @GetMapping("/search/greater-than/{age}")
    public ApiResponse<List<Student>>
    getStudentsAboveAge(
            @PathVariable int age)
    {
        List<Student> students =
                studentService
                        .getStudentsAboveAge(age);

        return new ApiResponse<>(
                "students fetched successfully",
                200,
                students
        );
    }

    @GetMapping("/pagination")
    public ApiResponse<Page<Student>>
    getStudentsWithPagination(
            @RequestParam int page,
            @RequestParam int size)
    {
        Page<Student> students =
                studentService
                        .getStudentsWithPagination(
                                page,
                                size);

        return new ApiResponse<>(
                "students fetched successfully",
                200,
                students
        );
    }


}
