package com.javed.springDataJpaExample;

import com.javed.springDataJpaExample.model.Student;
import com.javed.springDataJpaExample.repo.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaExampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaExampleApplication.class, args);

		StudentRepo repo = context.getBean(StudentRepo.class);

		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);

//		s1.setRollNo(101);
//		s1.setName("Mohan");
//		s1.setMarks(85);
//
//		s2.setRollNo(102);
//		s2.setName("Vivek");
//		s2.setMarks(75);
//
//		s3.setRollNo(103);
//		s3.setName("Biren");
//		s3.setMarks(95);
//
//		repo.save(s2);
//		repo.save(s3);


		System.out.println(repo.findByMarksGreaterThan(75));
	}

}
