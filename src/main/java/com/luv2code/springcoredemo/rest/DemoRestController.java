package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    // define a private field for the dependency
    private Coach myCoach;

    public DemoRestController(@Qualifier("aquatic") Coach theCoach) {
        System.out.println("In constructor: " + getClass().getSimpleName());
        this.myCoach = theCoach;
    }

    // define a setter for dependency injection
    @Autowired


    @GetMapping("/dailyworkout")
    String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
