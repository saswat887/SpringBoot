package com.org.dto;

public class Mobile {
	private int id;
	private String brand;
	private String model;
	private long price;
	
	public Mobile() {
	
	}
	public Mobile(int id, String brand, String model, long price) {
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	public final int getId() {
		return id;
	}
	public final void setId(int id) {
		this.id = id;
	}
	public final String getBrand() {
		return brand;
	}
	public final void setBrand(String brand) {
		this.brand = brand;
	}
	public final String getModel() {
		return model;
	}
	public final void setModel(String model) {
		this.model = model;
	}
	public final long getPrice() {
		return price;
	}
	public final void setPrice(long price) {
		this.price = price;
	}
	
	
}
