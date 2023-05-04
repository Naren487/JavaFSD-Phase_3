package com.examples.S01SpringCoreApp;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Employee {
	int id;
	String name;
	private List<String> depts;
	private Map<Integer,String> products;
	private Properties countriesLanguages;
	private Address address;
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Properties getCountriesLanguages() {
		return countriesLanguages;
	}
	public void setCountriesLanguages(Properties countriesLanguages) {
		this.countriesLanguages = countriesLanguages;
	}
	public Map<Integer, String> getProducts() {
		return products;
	}
	public void setProducts(Map<Integer, String> products) {
		this.products = products;
	}
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
	public List<String> getDepts() {
		return depts;
	}
	public void setDepts(List<String> depts) {
		this.depts = depts;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", depts=" + depts + ", products=" + products
				+ ", countriesLanguages=" + countriesLanguages + ", address=" + address + "]";
	}
	

}
