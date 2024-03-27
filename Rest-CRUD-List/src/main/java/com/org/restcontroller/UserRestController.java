package com.org.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.org.dao.UserDao;
import com.org.dto.User;

@RestController
public class UserRestController {
	@Autowired
	private UserDao dao;
	@GetMapping("/user/fetchAll")
	public List<User> fetchAllUser()
	{
		return dao.fetchAllUser();
	}
	@PostMapping("/user/save")
	public String saveUser(@RequestBody User user)
	{
		return dao.saveUser(user);
	}
	@GetMapping("/user/{id}")
	public User fetchUserById(@PathVariable int id)
	{
		return dao.fetchUserById(id);
	}
	@GetMapping("/user/delete/{id}")
	public boolean deleteById(@PathVariable int id)
	{
		return dao.deleteUserById(id);
	}
	@GetMapping("/user/update")
	public String updateUser(@RequestBody User user)
	{
		return dao.updateUser(user);
	}

}
