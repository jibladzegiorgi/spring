package com.giorgi.jibladze.springdemo.practice;

import com.giorgi.jibladze.springdemo.FortuneService;

import java.util.Random;

public class FeatureFortuneService implements FortuneService {

    private String[] stringArray = {
            "ცხვრის ტყავში გახვეული მგელი",
            "დათვფანჩარა",
            "მგელი მგლის ტყავს არ დახევსო",
            "ძაღლი კოჭლობით არ მოკვდებაო"
    };

    private Random random=new Random();

    @Override
    public String getFortune() {
        int index = random.nextInt(stringArray.length);

        return stringArray[index];
    }
}
