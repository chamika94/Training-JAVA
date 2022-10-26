package com.example.demo.servicer;

import com.example.demo.model.Student;

public interface StudentService {

    Student save(Student student);

    Student fetchStudentById(int id);
}
