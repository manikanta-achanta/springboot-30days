package com.manikanta.springboot_backend.basics.mapper;

import com.manikanta.springboot_backend.basics.dto.StudentDTO;
import com.manikanta.springboot_backend.basics.model.Student;

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
}