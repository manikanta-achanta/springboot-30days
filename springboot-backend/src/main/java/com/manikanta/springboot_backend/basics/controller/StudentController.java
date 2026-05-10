/*

package com.manikanta.springboot_backend.basics.controller;

import com.manikanta.springboot_backend.basics.model.ApiResponse;
import com.manikanta.springboot_backend.basics.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    List<Student> students = new ArrayList<>();

    // Create Student
    @PostMapping
    public ResponseEntity<ApiResponse> CreateStudents(@RequestBody Student student)
    {
        students.add(student);
        ApiResponse response=new ApiResponse("student created successfully",201);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);

    }

    // Get All Students
    @GetMapping
    public List<Student> getAllStudents()
    {
        return students;
    }

    // Get Student By ID
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id)
    {
        for(Student student : students)
        {
            if(student.getId() == id )
            {
                return student;
            }
        }

        return null;

    }


    //Delete Student By ID
    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse> deleteStudent(
            @PathVariable int id) {

        for (Student student : students) {

            if (student.getId() == id) {

                students.remove(student);

                ApiResponse response = new ApiResponse(
                        "Student deleted successfully",
                        200
                );

                return ResponseEntity.ok(response);
            }
        }

        ApiResponse response = new ApiResponse(
                "Student not found",
                404
        );

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(response);
    }



    //Updata Student By ID
    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse> updateStudent(
            @PathVariable int id,
            @RequestBody Student updatedStudent) {

        for (Student student : students) {

            if (student.getId() == id) {

                student.setName(updatedStudent.getName());
                student.setAge(updatedStudent.getAge());

                ApiResponse response = new ApiResponse(
                        "Student updated successfully",
                        200
                );

                return ResponseEntity.ok(response);
            }
        }

        ApiResponse response = new ApiResponse(
                "Student not found",
                404
        );

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(response);
    }



    // Health API
    @GetMapping("/health")
    public ResponseEntity<ApiResponse> health() {

        ApiResponse response = new ApiResponse(
                "Student API is running",
                200
        );

        return ResponseEntity.ok(response);
    }



}


 */
