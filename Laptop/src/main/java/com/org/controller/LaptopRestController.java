package com.org.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.dao.LaptopDao;
import com.org.dto.Laptop;

@RestController
@RequestMapping("/laptop")
public class LaptopRestController {
	@Autowired
	LaptopDao dao;
	@PostMapping
	public Laptop saveLaptop(@RequestBody Laptop laptop) {
		return dao.saveLaptop(laptop);
	}
	@GetMapping
	public List<Laptop> fetchAllLaptop(){
		return dao.fetchAll();
	}
	@PutMapping
	public Laptop updateLaptop(@RequestBody Laptop laptop) {
		return dao.updateLaptop(laptop);
	}
	@GetMapping("/{id}")
	public Laptop fetchLaptopById(@PathVariable int id) {
		return dao.fetchById(id);
	}
	@DeleteMapping("/{id}")
	public String deleteLaptopById(@PathVariable int id) {
		return dao.deleteById(id);
	}
	
	
}
