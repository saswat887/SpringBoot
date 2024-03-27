package com.jspyders;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StdRestController2 {
	@GetMapping("/msg")
	public String sendMsg()
	{
		return "WELCOME TO THE SPRING BOOT WORLD";
	}
	@GetMapping("/receive")
	public Students recieveStudent()
	{
		Students s=new Students();
		s.setName("Saswat");
		s.setAge(24);
		s.setEmail("saswat887@gmail.com");
		s.setPassword("1234");
		s.setMoible(7327858936l);
		return s;
		
	}
	@GetMapping("/list")
	public List<Students> list()
	{
		List<Students> l=new ArrayList<Students>();
		Students s=new Students();
		s.setName("Saswat");
		s.setAge(24);
		s.setEmail("saswat887@gmail.com");
		s.setPassword("1234");
		s.setMoible(7327858936l);
		
		Students s1=new Students();
		s1.setName("Sai");
		s1.setAge(24);
		s1.setEmail("sai@gmail.com");
		s1.setPassword("1234");
		s1.setMoible(1234567890l);
		
		Students s2=new Students();
		s2.setName("Piyush");
		s2.setAge(26);
		s2.setEmail("piyush@gmail.com");
		s2.setPassword("1234");
		s2.setMoible(987653l);
		
		Students s3=new Students("Swastik", 26, "swastik@gmail.com", "1234", 12345);
		
		l.add(s);
		l.add(s1);
		l.add(s2);
		l.add(s3);
		
		return l;
		
	}
	@PostMapping("/save")
	public String saveStudent(@RequestBody Students student)
	{
		System.out.println(student);
		return "data received";
	}
	@GetMapping("/send")
	public String m1(@RequestParam int age)
	{
		System.out.println(age);
		return "received";
	}
	@GetMapping("/send2/{id}")
	public String m2(@PathVariable("id") int studentId)
	{
		System.out.println(studentId);
		return "SUCCESSFUL"; 
	}
	@GetMapping("/send3/hello")
	public String m3()
	{
		System.out.println("HELLO");
		return "SUCCESSFUL"; 
	}
	

}

/*
 * Difference between request param and path variable
 */
