package com.examples.S02AutoWiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
     // TODO Auto-generated method stub
     		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/S02AutoWiring/springconfig.xml");
             //Constructure  Injection
             Employee e1=(Employee) ctx.getBean("emp");
             System.out.println(e1);
    }
}
