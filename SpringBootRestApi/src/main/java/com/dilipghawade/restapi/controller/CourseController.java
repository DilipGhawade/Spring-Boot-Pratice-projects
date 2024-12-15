package com.dilipghawade.restapi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dilipghawade.restapi.entity.Course;

@RestController
public class CourseController {

	@GetMapping("course/getAllCourses")
	public List<Course> getAllCouse() {
		return Arrays.asList(new Course(1, "Learn Aws", "Dilip"), new Course(2, "Learn Spring", "Dilip"));
	}

}
