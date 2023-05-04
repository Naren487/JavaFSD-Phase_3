package com.examples.S05SpringJDBC.entity;

public class Employee {
	private int id;
	private String name;
	private String salery;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSalery() {
		return salery;
	}
	public void setSalery(String salery) {
		this.salery = salery;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salery=" + salery + "]";
	}
	
}
