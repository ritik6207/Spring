package com.learn.spring_data_jpa;

import com.learn.spring_data_jpa.model.Student;
import com.learn.spring_data_jpa.repo.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);

		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);

		StudentRepo repo = context.getBean(StudentRepo.class);

//		s1.setName("Ritik");
//		s1.setRollNo(101);
//		s1.setMarks(87);
//
//		s2.setName("Puja");
//		s2.setRollNo(102);
//		s2.setMarks(78);
//
//		s3.setName("Mohan");
//		s3.setRollNo(103);
//		s3.setMarks(80);
//
//		repo.save(s2);
//		repo.save(s3);
//		repo.save(s1);

//		fetch all
//		System.out.println(repo.findAll());

//		find by id
//		System.out.println(repo.findById(102));

//		Optional<Student> s = repo.findById(103);
//		System.out.println(s.orElse(new Student()));

//		find by Name
//		System.out.println(repo.findByName("Ritik"));

//		find by Marks
//		System.out.println(repo.findByMarks(87));

//		find marks GreaterThen
		System.out.println(repo.findByMarksGreaterThan(78));
	}

}
