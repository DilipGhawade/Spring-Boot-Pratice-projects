package com.dilipghwade.springboot.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dilipghwade.springboot.learn_jpa_and_hibernate.course.Course;
import com.dilipghwade.springboot.learn_jpa_and_hibernate.course.jpa.CoureseJpaRepository;
import com.dilipghwade.springboot.learn_jpa_and_hibernate.course.jpa.CourseSpringBootJpaRepository;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

//	@Autowired
//	CourseJdbcRepository repository;
//	@Autowired
//	CoureseJpaRepository repository;
	
	@Autowired
	CourseSpringBootJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {

		Course course = new Course(1l, "Learn Aws", "in28Minutes");
		Course course1 = new Course(2l, "Learn Aws Now", "in28Minutes");
		Course course2 = new Course(3l, "Learn Java", "in28Minutes");
		Course course3 = new Course(4l, "Learn Java", "in28Minutes");
		Course course4 = new Course(5l, "C++", "dilip");
		Course course5 = new Course(6l, "Web development", "dilip");

		repository.save(course);
		repository.save(course1);
		repository.save(course2);
		repository.save(course3);
		repository.save(course4);
		repository.save(course5);

//		repository.deleteById(2l);

		System.out.println(repository.findById(1l));
		System.out.println(repository.findById(3l));
		
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		
		System.out.println(repository.findByAuthor("dilip"));
		System.out.println(repository.findByName("C++"));

//		System.out.println(repository.getCourseById(1l));
//		
//		System.out.println(repository.getCourseById(3l));

	}

}
