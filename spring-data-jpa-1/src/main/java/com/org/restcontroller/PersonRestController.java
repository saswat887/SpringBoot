package com.org.restcontroller;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.org.dao.PersonDao;
import com.org.dto.Perosn;

@RestController
@RequestMapping("/person")
public class PersonRestController {
	@Autowired
	PersonDao dao;
	
	@PostMapping //postmapping for saving
	public ResponseEntity<Perosn> savePerson(@RequestBody Perosn person)
	{
		Perosn person2= dao.savePerson(person);
		return new ResponseEntity<Perosn>(person2,HttpStatus.CREATED);
	}
	@PutMapping("/{id}") //putmapping for update
	public ResponseEntity<Perosn> updatePerson(@PathVariable int id,@RequestBody Perosn person)
	{
		Perosn person2=dao.fetchById(id);
		if(person2!=null)
			return new ResponseEntity<Perosn>(person2,HttpStatus.OK);
		return new ResponseEntity<Perosn>(HttpStatus.NOT_FOUND);
	}
	@GetMapping //getmapping for fetching data
	public ResponseEntity<List<Perosn>> findAll(){
		List<Perosn> list=dao.findAll();
		return new ResponseEntity<List<Perosn>>(list,HttpStatus.OK);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Perosn> fetchById(@PathVariable int id){
		Perosn person= dao.fetchById(id);
		if(person!=null)
			return new ResponseEntity<Perosn>(person,HttpStatus.OK);
		return new ResponseEntity<Perosn>(HttpStatus.NOT_FOUND);
	}
	@DeleteMapping("/{id}") //deletemapping for deleting data
	public String deleteById(@PathVariable int id){
		return dao.deleteById(id);
	}
	@GetMapping("/emp/{email}/{password}")
	public List<Perosn> findByEmailAndPassword(@PathVariable String email,@PathVariable String password){
		return dao.findByEmailAndPassword(email, password);
	}
	@GetMapping("/ema/{email}/{age}")
	public List<Perosn> findByEmailAndAge(@PathVariable String email,@PathVariable int age){
		return dao.findByEmailAndAge(email, age);
	}
	@GetMapping("/emn/{email}/{name}")
	public List<Perosn> findByEmailAndName(@PathVariable String email,@PathVariable String name){
		return dao.findByEmailAndName(name, email);
	}
	@GetMapping("/age/{age}")
	public List<Perosn> fetchByAge(@PathVariable int age){
		return dao.fetchByAge(age);
	}
	@GetMapping("/age/name/{age}")
	public List<String> fetchNameByAge(@PathVariable int age){
		return dao.fetchNameByAge(age);
	}
	@GetMapping("/age/{age1}/{age2}")
	public List<Perosn> fetchByAge2025(@PathVariable int age1,@PathVariable int age2){
		return dao.fetchByAge2025(age1,age2);
	}
	
	

	

}
