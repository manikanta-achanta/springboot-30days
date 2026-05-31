package com.manikanta.springboot_backend.basics.mapper;

import com.manikanta.springboot_backend.basics.dto.StudentDTO;
import com.manikanta.springboot_backend.basics.dto.StudentRequestDTO;
import com.manikanta.springboot_backend.basics.model.Student;
import com.manikanta.springboot_backend.basics.dto.StudentResponseDTO;

public class StudentMapper {

    public static StudentDTO convertToDTO(
            Student student)
    {
        if(student == null)
        {
            return null;
        }

        return new StudentDTO(
                student.getId(),
                student.getName()
        );
    }


    public static Student
    convertToEntity(
            StudentRequestDTO dto)
    {
        Student student =
                new Student();

        student.setName(
                dto.getName());

        student.setAge(
                dto.getAge());

        student.setPassword(
                dto.getPassword());

        return student;
    }

    public static StudentResponseDTO
    convertToResponseDTO(
            Student student)
    {
        return new StudentResponseDTO(
                student.getId(),
                student.getName(),
                student.getAge()
        );
    }
}