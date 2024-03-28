package com.org.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.dto.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	List<Student> findByName(String name);
	List<Student> findByEmailAndPassword(String email,String password);
	List<Student> findByEmail(String email);
}
