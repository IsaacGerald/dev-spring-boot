package com.telusko.spring_data_jpa_ex;

import com.telusko.spring_data_jpa_ex.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaExApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaExApplication.class, args);

		StudentRepo repo = context.getBean(StudentRepo.class);

		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);

//		s1.setRollno(101);
//		s1.setName("Navin");
//		s1.setMarks(75);
//
		s2.setRollno(102);
		s2.setName("Kiran");
		s2.setMarks(65);
//
//		s3.setRollno(103);
//		s3.setName("Harsh");
//		s3.setMarks(70);
//
//
//		repo.save(s2);
//		repo.save(s3);


		repo.delete(s2);

	}

}
