package com.examples.S03StereoTypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.examples.beans.Instructor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/S03StereoTypes/springconfig.xml");
        Instructor in=(Instructor) ctx.getBean("instructor");
        System.out.println(in);
    }
}
