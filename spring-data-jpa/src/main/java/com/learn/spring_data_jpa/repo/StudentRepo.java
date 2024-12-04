package com.learn.spring_data_jpa.repo;

import com.learn.spring_data_jpa.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

//    @query is option if require then use => ?1 is define as how many parameter pass
//    @Query("select s from Student s where s.name = ?1")
    List<Student> findByName(String name);
    List<Student> findByMarks(int marks);

    List<Student> findByMarksGreaterThan(int marks);
}
