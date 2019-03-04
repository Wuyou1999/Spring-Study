package com.spring.quickstart.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by asus on 2019/2/25.
 */
public class StudentAPP {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("/beans.xml");
        Student student= (Student) context.getBean("student");
        System.out.println(student);
    }
}
