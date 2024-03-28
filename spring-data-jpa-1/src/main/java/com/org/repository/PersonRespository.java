package com.org.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.org.dto.Perosn;

public interface PersonRespository extends JpaRepository<Perosn, Integer>{
	List<Perosn> findByEmailAndPassowrd(String email,String password);
	List<Perosn> findByEmailAndAge(String email,int age);
	List<Perosn> findByNameAndEmail(String name,String email);
	@Query("select p from Perosn p where p.age>=?1")
	List<Perosn> fetchByAge(int age);
	@Query("select p.name from Perosn p where p.age>=?1")
	List<String> fetchNameByAge(int age);
	@Query("select p from Perosn p where p.age>=?1 and p.age<=?2")
	List<Perosn> fetchByAge2025(int age1,int age2);
	
	
}
