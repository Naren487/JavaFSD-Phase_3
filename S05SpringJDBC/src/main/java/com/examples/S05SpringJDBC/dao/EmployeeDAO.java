package com.examples.S05SpringJDBC.dao;

import java.util.List;

import com.examples.S05SpringJDBC.entity.Employee;

public interface EmployeeDAO {
	public int create(Employee emp);
	public int update(Employee emp);
	public int delete(int id);
	Employee read(int id);
	List<Employee> read();
}
