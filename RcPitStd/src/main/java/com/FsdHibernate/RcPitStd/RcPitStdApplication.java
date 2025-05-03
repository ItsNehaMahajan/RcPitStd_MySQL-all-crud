package com.FsdHibernate.RcPitStd;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class RcPitStdApplication {

	public static void main(String[] args) {
		SpringApplication.run(RcPitStdApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		 return  runner->{


//			 createStudent(studentDAO);

			 ReadData(studentDAO); //findbyId

//			 findeveryStudent(studentDAO);
//			 findStudent(studentDAO);

//			 updateStudent(studentDAO);


		 };
	}


//	private void createStudent(StudentDAO studentDAO) {
//
//		Student s1=new Student(1,"Neha","Mahajan","CSE","Neha@gmail.com");
//		Student s2=new Student(1,"gaurii","patil","CSE","gaurii@gmail.com");
//		Student s3=new Student(1,"sakshi","Mahajan","CSE","sakshi@gmail.com");
//		Student s4=new Student(1,"manasi","patil","CSE","manasi@gmail.com");
//		studentDAO.save(s1);
//		studentDAO.save(s2);
//		studentDAO.save(s3);
//		studentDAO.save(s4);
//	}

	void ReadData(StudentDAO studentDAO) {


		Student s=studentDAO.findById(1);
		System.out.println(s);
	}









//	private void updateStudent(StudentDAO studentDAO) {
//		Student s=studentDAO.findStudent(1818);
//		s.setLastName("master");
//		studentDAO.update(s);
//
//	}
//
//	private void findStudent(StudentDAO studentDAO) {
//
//		List<Student> students=studentDAO.findByLastName("sonawane");
//		for(Student s : students){
//
//			System.out.println(s);
//		}
//
//	}
//
//	private void findeveryStudent(StudentDAO studentDAO) {
//
//		 List<Student> students=studentDAO.findAll();
//
//		 for(Student s : students){
//
//			 System.out.println(s);
//		 }
//
//
//
//
//	}
//



}
