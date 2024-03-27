package com.org.dto;

import org.springframework.stereotype.Component;

@Component
public class User {
	private int id;
	private String name;
	private int age;
	private String email;
	private String password;
	private long mobile;
	
	
	public User() {
		super();
	}


	public User(int id, String name, int age, String email, String password, long mobile) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
	}


	public final int getId() {
		return id;
	}


	public final void setId(int id) {
		this.id = id;
	}


	public final String getName() {
		return name;
	}


	public final void setName(String name) {
		this.name = name;
	}


	public final int getAge() {
		return age;
	}


	public final void setAge(int age) {
		this.age = age;
	}


	public final String getEmail() {
		return email;
	}


	public final void setEmail(String email) {
		this.email = email;
	}


	public final String getPassword() {
		return password;
	}


	public final void setPassword(String password) {
		this.password = password;
	}


	public final long getMobile() {
		return mobile;
	}


	public final void setMobile(long mobile) {
		this.mobile = mobile;
	}
	
	

}
