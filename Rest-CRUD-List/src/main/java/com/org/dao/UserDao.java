package com.org.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.org.dto.User;
@Component
public class UserDao {
	private static ArrayList<User> list=new ArrayList<User>();
	
	static {
		list.add(new User(1, "Saswat", 24, "saswat887@gmail.com", "1234", 7327858936l));
		list.add(new User(2, "Sai", 25, "sai887@gmail.com", "1234", 73278589236l));
		list.add(new User(3, "Sagar", 22, "sagar887@gmail.com", "1234", 73278512336l));
		list.add(new User(4, "Piyush", 21, "piyush887@gmail.com", "1234", 7327345936l));
		list.add(new User(5, "Swastik", 26, "swastik887@gmail.com", "1234", 73272348936l));
	}
	
	public String saveUser(User user) {
		list.add(user);
		return "Data Stored Successfully";
	}
	public User fetchUserById(int id) {
		for (User user : list) {
			if(user.getId()==id)
			{
				return user;
			}
		}
		return null;
	}
	public List<User> fetchAllUser() {
		return list;
	}
	public boolean deleteUserById(int id) {
		User user=null;
		for (User user2 : list) {
			if(user2.getId()==id)
				user=user2;
		}
		if(user!=null)
		{
			list.remove(user);
			return true;
		}
		else
		{
			return false;
		}
	}
	public String updateUser(User user)
	{
		for (User user1 : list) {
			if(user1.getId()==user.getId())
			{
				user1.setName(user.getName());
				user1.setAge(user.getAge());
				user1.setMobile(user.getMobile());
				user1.setEmail(user.getEmail());
				user1.setPassword(user.getPassword());
				return "Updated";
			}
		}
		return "Id not exist";
	}
}
