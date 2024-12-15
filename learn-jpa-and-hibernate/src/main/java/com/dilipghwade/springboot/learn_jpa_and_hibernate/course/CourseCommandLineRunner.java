//package com.dilipghwade.springboot.learn_jpa_and_hibernate.course;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import com.dilipghwade.springboot.learn_jpa_and_hibernate.course.jpa.CoureseJpaRepository;
//
//@Component
//public class CourseCommandLineRunner implements CommandLineRunner{
//	
//	@Autowired
//	private CoureseJpaRepository repository;
//
//	@Override
//	public void run(String... args) throws Exception {
//		
//		Course course = new Course(4l, "Learn Aws jpa", "in28Minutes");
//		Course course1 = new Course(2l, "Learn Aws Now jpa", "in28Minutes");
//		Course course2 = new Course(5l, "Learn Java jpa", "in28Minutes");
//
//		repository.insert(course);
//		repository.insert(course1);
//		repository.insert(course2);
//		
//		repository.deleteById(2l);
//		
//		repository.findById(1l);
//		
//		repository.findById(3l);
//		
//	}
//	
//	
//
//}
