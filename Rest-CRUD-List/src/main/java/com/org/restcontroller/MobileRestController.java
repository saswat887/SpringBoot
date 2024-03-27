package com.org.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.org.dao.MobileDao;
import com.org.dto.Mobile;
@RestController
public class MobileRestController {
	@Autowired
	MobileDao dao;
	@GetMapping("/mobile/fetchAll")
	public List<Mobile> fetchAllMobile(){
		return dao.fetchAllMobile();
	}
	@PostMapping("/mobile/save")
	public String saveUser(@RequestBody Mobile mobile) {
		return dao.saveMobile(mobile);
	}
	@GetMapping("/mobile/{id}")
	public Mobile fetchMobileById(@PathVariable int id) {
		return dao.fetchMobileById(id);
	}
	@GetMapping("/mobile/delete/{id}")
	public boolean deleteById(@PathVariable int id)
	{
		return dao.deleteMobileById(id);
	}
	
}
