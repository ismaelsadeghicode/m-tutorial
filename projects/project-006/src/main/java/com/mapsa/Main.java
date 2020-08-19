package com.mapsa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Esmaeil Sadeghi, 7/31/20 11:19 AM
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:bean.xml");
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        helloWorld.getAge();

        HelloWorld helloWorld2 = (HelloWorld) context.getBean("helloWorld");
        helloWorld2.getMsg();

        HelloWorld helloWorld3 = (HelloWorld) context.getBean("helloWorld");
        helloWorld3.getMsg();

    }
}
