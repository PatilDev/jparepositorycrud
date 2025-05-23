package com.dev.cruddemo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.cruddemo.Entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
// No need to write any method – CRUD is auto-supported!
}
