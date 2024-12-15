package com.dilipghawade.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dilipghawade.restapi.entity.*;
public interface StudenRepository extends JpaRepository<Student, Integer>{
	

}
