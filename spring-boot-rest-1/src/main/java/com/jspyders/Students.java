package com.jspyders;

import org.springframework.stereotype.Component;

@Component
public class Students {
	private String name;
	private int age;
	private String email;
	private String password;
	private long moible;
	
	public Students() {
		
	}
	public Students(String name, int age, String email, String password, long moible) {
		
		this.name = name;
		this.age = age;
		this.email = email;
		this.password = password;
		this.moible = moible;
	}
	
	@Override
	public String toString() {
		return "Students [name=" + name + ", age=" + age + ", email=" + email + ", password=" + password + ", moible="
				+ moible + "]";
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
	public final long getMoible() {
		return moible;
	}
	public final void setMoible(long moible) {
		this.moible = moible;
	}
	

}
