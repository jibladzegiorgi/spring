package com.giorgi.jibladze.springdemo;

import com.giorgi.jibladze.springdemo.practice.FeatureFortuneService;

public class FootballCoach  implements Coach{

    private FortuneService featureFortuneService;

    public FootballCoach(FeatureFortuneService featureFortuneService) {
        this.featureFortuneService = featureFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "sparing";
    }

    @Override
    public String getDailyFortune() {
        return featureFortuneService.getFortune();
    }
}
