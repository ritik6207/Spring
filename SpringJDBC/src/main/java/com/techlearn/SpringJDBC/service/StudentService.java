package com.techlearn.SpringJDBC.service;

import com.techlearn.SpringJDBC.model.Student;
import com.techlearn.SpringJDBC.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepo repo;

    public StudentRepo getStudentRepo() {
        return repo;
    }

    @Autowired
    public void setStudentRepo(StudentRepo studentRepo) {
        this.repo = studentRepo;
    }

    public void addStudent(Student st) {
        repo.save();
    }

    public List<Student> getStudent() {
        return repo.findAll();
    }
}
