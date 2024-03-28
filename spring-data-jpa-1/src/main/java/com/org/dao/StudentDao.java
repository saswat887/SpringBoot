package com.org.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.dto.Student;
import com.org.repository.StudentRepository;
@Component
public class StudentDao {
	@Autowired
	StudentRepository repo;
	
	public List<Student> fetchAll(){
		return repo.findAll();
	}
	
	public Student save(Student student) {
		return repo.save(student);
	}
	
	public Student findById(int id) {
		return repo.findById(id).orElse(null);
	}
	
	public String deleteById(int id) {
		Student s=findById(id);
		if(s!=null) {
			repo.delete(s);
			return "Data Deleted";
		}
		else
			return "Data Not Present";
	}
	public Student updateById(Student student,int id) {
		Student s=findById(id);
		if(s!=null) {
			return repo.save(student);
		}
		else
			return null;
	}
	
	public List<Student> findByName(String name){
		return repo.findByName(name);
	}
	
	public List<Student> findByEmailAndPassword(String email,String password){
	
		return repo.findByEmailAndPassword(email, password);
	}

}
