package com.examples.S01SpringCoreApp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class springconfig {
	@Bean
	public Employee emp1() {
		 Employee emp=new Employee();
		 emp.setId(1);
		 emp.setName("Naren");
		 return emp;
	}
	
	@Bean
	public Employee emp2() {
		 Employee emp=new Employee();
		 emp.setId(2);
		 emp.setName("Narendra");
		 return emp;
	}
	
	@Bean
	public Employee emp3() {
		 Employee emp=new Employee();
		 emp.setId(3);
		 emp.setName("Kumar");
		 return emp;
	}
	
	@Bean
	public Employee emp4() {
		 Employee emp=new Employee();
		 emp.setId(4);
		 emp.setName("Venkat");
		 List<String> depts=new ArrayList<>();
		 depts.add("HR");
		 depts.add("Sales");
		 depts.add("Admin");
		 emp.setDepts(depts);
		 return emp;
	}
	
	@Bean
	public Employee emp5() {
		 Employee emp=new Employee();
		 emp.setId(5);
		 emp.setName("ABC");
		 return emp;
	}
	
	@Bean
	public Employee emp6() {
		 Employee emp=new Employee();
		 emp.setId(6);
		 emp.setName("XYZ");
		 return emp;
	}
	
	@Bean
	public Employee emp7() {
		 Employee emp=new Employee();
		 emp.setId(7);
		 emp.setName("Kumar");
		 Address add=new Address();
		 add.setCity("HYD");
		 add.setPincode("500016");
		 add.setState("Telangana");
		 emp.setAddress(add);
		 return emp;
	}
}
