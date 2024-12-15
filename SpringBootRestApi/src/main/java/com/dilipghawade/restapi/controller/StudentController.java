package com.dilipghawade.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.dilipghawade.restapi.entity.Student;
import com.dilipghawade.restapi.repository.StudenRepository;

@RestController
public class StudentController {
	// get all the student
	@Autowired
	StudenRepository repo;

	@GetMapping("/students")
	public List<Student> getAllStudents() {
		List<Student> students = repo.findAll();

		return students;
	}

	@GetMapping("/students/{id}")
	public Student getStudent(@PathVariable int id) {

		Student student = repo.findById(id).get();
		return student;
	}

	@PostMapping("/student/add")
	@ResponseStatus(code = HttpStatus.CREATED)
	public ResponseEntity<Student> createStudent(@RequestBody Student student) {
		Student newStudent =repo.save(student);
		return ResponseEntity.status(HttpStatus.CREATED).body(student);

	}
	
	@PutMapping("student/update/{id}")
	public Student updateStudents(@PathVariable int id) {
		Student student = repo.findById(id).get();
		student.setName("pooname");
		student.setBranch("Local");
		student.setPercentage(91);
		repo.save(student);
		return student;
		
	}

	@DeleteMapping("student/delete/{id}")
	public void removeStudent(@PathVariable int id) {
		Student student = repo.findById(id).get();
		repo.delete(student);
		
	}
//	@PutMapping("student/update/{id}")
//	public ResponseEntity<String> updateStudent(@PathVariable int id, @RequestBody Student updateStudent) {
//		Optional<Student> optionalStudent = repo.findById(id);
//		if(optionalStudent.isPresent()) {
//			Student student = optionalStudent.get();
//			student.setName(updateStudent.getName());
//			student.setBranch(updateStudent.getBranch());
//			student.setPercentage(updateStudent.getPercentage());
//			repo.save(student);
//			return ResponseEntity.ok("Update successfully.");
//		}else {
//		return ResponseEntity.status(HttpStatus.NOT_FOUND)
//				.body("Student with id "+id+"not found");
//		}
//
//	}

}
