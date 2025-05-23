package com.dev.cruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.cruddemo.DAO.StudentRepository;
import com.dev.cruddemo.Entity.Student;
@Service
public class StudentServiceImpl implements StudentService {
@Autowired
StudentRepository studentRepository;

@Override
public List<Student> getAllStudent() {
return studentRepository.findAll();
}

@Override
public Student getStudentById(int id) {
    return studentRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));
}

@Override
public void saveStudent(Student student) {
    studentRepository.save(student);
}


@Override
public void deleteStudent(int id) {
    studentRepository.deleteById(id);
}

}
