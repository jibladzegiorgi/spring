package com.giorgi.jibladze.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theCoach = context.getBean("myCoach", Coach.class);

//        Coach theFootballCoach = context.getBean("footballCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());
//        System.out.println(theFootballCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        context.close();
    }
}
