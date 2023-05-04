package com.examples.S06SpringORMDemo;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.examples.S06SpringORMDemo.dao.ProductDAO;
import com.examples.S06SpringORMDemo.entity.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        create();
//        update();
//    	delete();
//    	find();
    	findAll();
    }

	private static void findAll() {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/examples/S06SpringORMDemo/springconfig.xml");
		ProductDAO productdao=(ProductDAO) ctx.getBean("productdao");
		List<Product> pro=productdao.findall();
		System.out.println(pro);
	}

	private static void find() {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/examples/S06SpringORMDemo/springconfig.xml");
		ProductDAO productdao=(ProductDAO) ctx.getBean("productdao");
		Product pro=productdao.find(2);
		System.out.println(pro);
	}

	private static void delete() {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/examples/S06SpringORMDemo/springconfig.xml");
		ProductDAO productdao=(ProductDAO) ctx.getBean("productdao");
		Product pro=new Product();
		pro.setId(1);
//		pro.setName("Hp 15S");
//		pro.setDescription("8GB 512 SSD");
//		pro.setPrice(35000.00);
		productdao.delete(pro);
	}

	private static void update() {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/examples/S06SpringORMDemo/springconfig.xml");
		ProductDAO productdao=(ProductDAO) ctx.getBean("productdao");
		Product pro=new Product();
		pro.setId(1);
		pro.setName("Hp 15S");
		pro.setDescription("8GB 512 SSD");
		pro.setPrice(35000.00);
		productdao.update(pro);
	}

	private static void create() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/examples/S06SpringORMDemo/springconfig.xml");
		ProductDAO productdao=(ProductDAO) ctx.getBean("productdao");
		Product pro=new Product();
		pro.setId(1);
		pro.setName("Laptop");
		pro.setDescription("8GB 512 SSD");
		pro.setPrice(5600.00);
		int result=productdao.create(pro);
		System.out.println(result);

//		Product pro2=new Product();
//		pro2.setId(2);
//		pro2.setName("Dell");
//		pro2.setDescription("8GB 512 SSD");
//		pro2.setPrice(5600.00);
//		int result=productdao.create(pro2);
//		System.out.println(result);
//
//		Product pro3=new Product();
//		pro3.setId(3);
//		pro3.setName("Lenovo");
//		pro3.setDescription("8GB 512 SSD");
//		pro3.setPrice(5600.00);
//		result=productdao.create(pro3);
//		System.out.println(result);

	}
}
