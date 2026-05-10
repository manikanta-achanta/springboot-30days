package com.manikanta.springboot_backend.basics.Service;

import com.manikanta.springboot_backend.basics.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {


    private List<Student> students =new ArrayList<>();

    public String addStudent(Student student)
    {
        students.add(student);
        return "student added successfully";
    }

    public List<Student> getAllStudents()
    {
        return students;
    }

    public Student getStudentByID(int id)
    {
        for(Student student : students)
        {
            if(student.getId()==id)
            {
                return student;
            }
        }
        return null;
    }

    public String deleteStudentByID(int id)
    {
         for(Student student : students)
        {
            if(student.getId()==id)
            {
                students.remove(student);
                return "student deleted successfully";
            }
        }
         return "student not found";
    }

    public String updateStudentByID(int id,Student updateStudent)
    {
        for(Student student : students)
        {
            if(student.getId()==id)
            {
                student.setName(updateStudent.getName());
                student.setAge(updateStudent.getAge());
                return "student updated successfully";
            }
        }
        return "student not found";
    }
}
