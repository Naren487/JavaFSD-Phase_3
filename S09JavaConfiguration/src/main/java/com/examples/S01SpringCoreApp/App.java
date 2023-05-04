package com.examples.S01SpringCoreApp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        demo1();
//    	demo2();
//    	demo3();
    	
//    	demo4();
    }

	private static void demo4() {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/S01SpringCoreApp/springconfig4.xml");
        //Constructure  Injection
        EmployeeDAO e1=(EmployeeDAO) ctx.getBean("homepc");
        System.out.println(e1);
	}

	private static void demo3() {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/S01SpringCoreApp/springconfig3.xml");
        //Constructure  Injection
        Computer c1=(Computer) ctx.getBean("homepc");
        System.out.println(c1);
        
        Computer c2=(Computer) ctx.getBean("officepc");
        System.out.println(c2);
	}

	private static void demo2() {
		// TODO Auto-generated method stub
ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/S01SpringCoreApp/springconfig2.xml");
        // singleton beam
        Car c1=(Car) ctx.getBean("car");
        System.out.println(c1.hashCode());
        
        Car c2=(Car) ctx.getBean("car");
        System.out.println(c2.hashCode());
        
        
        //Prototype bean
        
        Bank b1=(Bank) ctx.getBean("bank");
        System.out.println(b1.hashCode());
        
        Bank b2=(Bank) ctx.getBean("bank");
        System.out.println(b2.hashCode());
        
        Bank b3=(Bank) ctx.getBean("bank");
        System.out.println(b3.hashCode());
	}

	private static void demo1() {
		System.out.println( "Hello World!" );
//        Traditional Method
//        Employee emp=new Employee();
//        emp.setId(1);
//        emp.setName("Naren");
//        System.out.println(emp);
        
        
//        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/S01SpringCoreApp/springconfig.xml");
        
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(springconfig.class);
        Employee emp1=(Employee) ctx.getBean("emp1");
        System.out.println(emp1);
        Employee emp2=(Employee) ctx.getBean("emp2");
        System.out.println(emp2);
        Employee emp3=(Employee) ctx.getBean("emp3");
        System.out.println(emp3);
        
        Employee emp4=(Employee) ctx.getBean("emp4");
        System.out.println(emp4);
        
        Employee emp5=(Employee) ctx.getBean("emp5");
        System.out.println(emp5);
        
        Employee emp6=(Employee) ctx.getBean("emp6");
        System.out.println(emp6);
        
        Employee emp7=(Employee) ctx.getBean("emp7");
        System.out.println(emp7);
	}
}
