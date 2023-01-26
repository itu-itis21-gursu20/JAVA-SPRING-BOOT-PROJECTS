package com.berkaygursu.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.berkaygursu.sms.entity.Student;
import com.berkaygursu.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student("Berkay", "Gürsu", "berkaygursu@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2 = new Student("Ahmet", "Yılmaz", "ahmetyilmaz@gmail.com");
//		studentRepository.save(student2);
//		
//		Student student3 = new Student("Mehmet", "Yıldız", "mehmetyildiz@gmail.com");
//		studentRepository.save(student3);
	}

}
