package com.giorgi.jibladze.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theCoach = context.getBean("practice", FootballCoach.class);
        System.out.println(theCoach.getDailyFortune());

        context.close();
    }
}
