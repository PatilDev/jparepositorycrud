package com.dev.cruddemo.service;

import java.util.List;

import com.dev.cruddemo.Entity.Student;

public interface StudentService {
    List<Student> getAllStudent();
    Student getStudentById(int id);
    void saveStudent(Student student);
    void deleteStudent(int id);
    

}
