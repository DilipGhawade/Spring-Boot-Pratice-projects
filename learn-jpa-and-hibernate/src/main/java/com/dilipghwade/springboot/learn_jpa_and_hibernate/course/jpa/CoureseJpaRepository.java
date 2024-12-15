
package com.dilipghwade.springboot.learn_jpa_and_hibernate.course.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dilipghwade.springboot.learn_jpa_and_hibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CoureseJpaRepository {
	@PersistenceContext
	private EntityManager entityManager;
	
	
	public void insert(Course course) {
		entityManager.merge(course);
		
	}
	
	public void findById(long id) {
		entityManager.find(Course.class, id);
		
	}
	
	public void deleteById(long id) {
		Course course = entityManager.find(Course.class, id);
		
		 entityManager.remove(course);
		
		
	}
	
	

}