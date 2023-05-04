package com.examples.S05SpringJDBC.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.examples.S05SpringJDBC.entity.Employee;
import com.examples.S05SpringJDBC.rowmapper.EmployeeRowMapper;
@Component("employeedao")
public class EmployeeDAOImpl implements EmployeeDAO{
	@Autowired
	private JdbcTemplate jdbctemplate;
	@Override
	public int create(Employee emp) {
		String sql="insert into employee values (?,?,?)";
    	int result=jdbctemplate.update(sql,emp.getId(),emp.getName(),emp.getSalery());
    	
		return result;
	}
	@Override
	public int update(Employee emp) {
		String sql="update employee set firstname=?,lastname=? where id=?";
    	int result=jdbctemplate.update(sql,emp.getName(),emp.getSalery(),emp.getId());
    	
		return result;
	}
	@Override
	public int delete(int id) {
		String sql="delete from employee where id=?";
    	int result=jdbctemplate.update(sql,id);
    	
		return result;
	}
	@Override
	public Employee read(int id) {
		String sql="select * from employee where id=?";
		EmployeeRowMapper empRowMapper=new EmployeeRowMapper(); 
    	Employee employee=jdbctemplate.queryForObject(sql, empRowMapper,id);
    	
		return employee;
	}
	@Override
	public List<Employee> read() {
		String sql="select * from employee";
		EmployeeRowMapper empRowMapper=new EmployeeRowMapper(); 
    	List<Employee> employee=jdbctemplate.query(sql, empRowMapper);
    	
		return employee;
	}

}
