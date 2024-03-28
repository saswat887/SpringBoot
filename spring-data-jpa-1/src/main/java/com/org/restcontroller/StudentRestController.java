package com.org.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.org.dao.StudentDao;
import com.org.dto.Student;
import com.org.repository.StudentRepository;

@RestController
@RequestMapping("/student")
public class StudentRestController {
	@Autowired
	StudentDao dao;
	@GetMapping
	public List<Student> fetchAll(){
		return dao.fetchAll();
	}
	@PostMapping
	public Student save(@RequestBody Student student) {
		return dao.save(student);
	}
	@GetMapping("/{id}")
	public Student findById(@PathVariable int id) {
		return dao.findById(id);
	}
	@DeleteMapping("/{id}")
	public String deleteById(@PathVariable int id) {	
		return dao.deleteById(id);
	
	}
	@PutMapping("/{id}")
	public Student updateById(@RequestBody Student student,@PathVariable int id) {
		return dao.updateById(student, id);
	}
	@GetMapping("/findByName/{name}")
	public List<Student> fetchStudentByName(@PathVariable String name){
		return dao.findByName(name);
	}
	@GetMapping("/{email}/{password}")
	public boolean findByEmailAndPassword(@PathVariable String email,@PathVariable String password) {
		List<Student> l=dao.findByEmailAndPassword(email, password);
		if(!l.isEmpty())
			return true;
		else
			return false;
	}

}
