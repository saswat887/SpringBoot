package com.org.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.dto.Perosn;
import com.org.repository.PersonRespository;
@Component
public class PersonDao {
	@Autowired
	PersonRespository repo;
	
	public  Perosn savePerson(Perosn person) {
		return repo.save(person);
	}

	public List<Perosn> findAll() {
		return repo.findAll();
	}
	
	public Perosn fetchById(int id) {
	/*	Optional<Perosn> obj= repo.findById(id);
		if(obj.isPresent())
		{
			return obj.get();
		}
		return null;*/
		
		return repo.findById(id).orElse(null);
	}
	
	public String deleteById(int id) {
		/*Optional<Perosn> obj= repo.findById(id);
		if(obj.isPresent())
		{
			repo.deleteById(id);
			return "Data Deleted";
		}
		return "Data not Present";*/
		Perosn person=fetchById(id);
		if(person!=null)
		{
			repo.deleteById(id);
			return "Successfully Deleted";
		}
		return "Person not found for the ID: "+id;

	}
	public List<Perosn> findByEmailAndPassword(String email,String password){
		return repo.findByEmailAndPassowrd(email, password);
	}
	public List<Perosn> findByEmailAndAge(String email,int age){
		return repo.findByEmailAndAge(email, age);
	}
	public List<Perosn> findByEmailAndName(String email,String name){
		return repo.findByNameAndEmail(name, email);
	}

	public List<Perosn> fetchByAge(int age){
		return repo.fetchByAge(age);
	}
	public List<String> fetchNameByAge(int age){
		return repo.fetchNameByAge(age);
	}
	public List<Perosn> fetchByAge2025(int age1,int age2){
		return repo.fetchByAge2025(age1,age2);
	}
	public List<Object> fetchNameEmailByAge(int age){
		return repo.fetchNameEmailByAge(age);
	}

}
