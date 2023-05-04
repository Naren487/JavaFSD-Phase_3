package com.examples.S04InterfaceInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.examples.S04InterfaceInjection.service.OrderService;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/S04InterfaceInjection/springconfig.xml");
        OrderService in=(OrderService) ctx.getBean("orderservice");
        in.placeOrder();
    }
}
