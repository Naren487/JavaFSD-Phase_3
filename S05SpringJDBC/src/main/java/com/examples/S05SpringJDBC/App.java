package com.examples.S05SpringJDBC;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.examples.S05SpringJDBC.dao.EmployeeDAO;
import com.examples.S05SpringJDBC.entity.Employee;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
//		create();
//		update();
//		delete();
//		readOne();
		readAll();
	}
	private static void create() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/examples/S05SpringJDBC/springconfig.xml");

		EmployeeDAO employeedao = (EmployeeDAO) ctx.getBean("employeedao");

		// Insert data
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("Naren");
		emp.setSalery("1212");
		employeedao.create(emp);

	}
	private static void update() {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/examples/S05SpringJDBC/springconfig.xml");

		EmployeeDAO employeedao = (EmployeeDAO) ctx.getBean("employeedao");

//    								Update Data
		Employee emp = new Employee();
		emp.setId(2);
		emp.setName("Mahendhar");
		emp.setSalery("2323");
		employeedao.update(emp);

	}

	private static void delete() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/examples/S05SpringJDBC/springconfig.xml");

		EmployeeDAO employeedao = (EmployeeDAO) ctx.getBean("employeedao");

		employeedao.delete(1);
	}

	private static void readOne() {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/examples/S05SpringJDBC/springconfig.xml");

		EmployeeDAO employeedao = (EmployeeDAO) ctx.getBean("employeedao");
		Employee emp=employeedao.read(2);
		System.out.println(emp);

	}

	private static void readAll() {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/examples/S05SpringJDBC/springconfig.xml");

		EmployeeDAO employeedao = (EmployeeDAO) ctx.getBean("employeedao");
		List<Employee> emp=employeedao.read();
		System.out.println(emp);
	}

	
}
