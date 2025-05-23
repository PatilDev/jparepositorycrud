package com.dev.cruddemo.Entity;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Student {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column
    int studentrollno;
    @Column
    String studentName;
    @Column
    int studentAge;

    public Student() {
    }

    public Student(int studentrollno, String studentName, int studentAge) {
        this.studentrollno = studentrollno;
        this.studentName = studentName;
        this.studentAge = studentAge;
    }

    public int getStudentrollno() {
        return this.studentrollno;
    }

    public void setStudentrollno(int studentrollno) {
        this.studentrollno = studentrollno;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return this.studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public Student studentrollno(int studentrollno) {
        setStudentrollno(studentrollno);
        return this;
    }

    public Student studentName(String studentName) {
        setStudentName(studentName);
        return this;
    }

    public Student studentAge(int studentAge) {
        setStudentAge(studentAge);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Student)) {
            return false;
        }
        Student student = (Student) o;
        return studentrollno == student.studentrollno && Objects.equals(studentName, student.studentName) && studentAge == student.studentAge;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentrollno, studentName, studentAge);
    }

    @Override
    public String toString() {
        return "{" +
            " studentrollno='" + getStudentrollno() + "'" +
            ", studentName='" + getStudentName() + "'" +
            ", studentAge='" + getStudentAge() + "'" +
            "}";
    }



}
