package com.techlearn.SpringJDBC;

import com.techlearn.SpringJDBC.model.Student;
import com.techlearn.SpringJDBC.repo.StudentRepo;
import com.techlearn.SpringJDBC.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);

		Student st = context.getBean(Student.class);
		st.setRollNo(101);
		st.setName("Ritik");
		st.setMarks(87);

		StudentService service = context.getBean(StudentService.class);
		service.addStudent(st);

//		print all the student
		List<Student> students = service.getStudent();
		System.out.println(students);
	}

}
