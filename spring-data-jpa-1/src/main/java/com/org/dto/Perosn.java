package com.org.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Perosn {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int age;
	private String email;
	private String passowrd;
	
	public Perosn() {
		
	}
	public Perosn(int id, String name, int age, String email, String passowrd) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.passowrd = passowrd;
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
	public final String getPassowrd() {
		return passowrd;
	}
	public final void setPassowrd(String passowrd) {
		this.passowrd = passowrd;
	}
	

}
