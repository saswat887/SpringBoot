package com.org.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.dto.Laptop;
import com.org.repository.LaptopRepository;
@Component
public class LaptopDao {
	@Autowired
	LaptopRepository repo;
	
	public Laptop saveLaptop(Laptop laptop) {
		return repo.save(laptop);
	}
	
	public Laptop updateLaptop(Laptop laptop) {
		return repo.save(laptop);
	}
	
	public List<Laptop> fetchAll(){
		return repo.findAll();
	}
	
	public Laptop fetchById(int id) {
		return repo.findById(id).orElse(null);
	}
	
	public String deleteById(int id) {
		Laptop l=fetchById(id);
		if(l!=null) {
			repo.deleteById(id);
			return "Data Deleted";
		}
		return "Data Not Found";
	}
}
