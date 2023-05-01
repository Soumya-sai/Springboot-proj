package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

   //  inject properties for: coach.name and team.name
  @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;

   // expose new end point for"teaminfo"
   @GetMapping("/teaminfo")
   public String getteamInfo(){
   return "coach: " + coachName + ",Team name: " + teamName;
   }

    @GetMapping("/")
    public String sayHello(){
        return  "hello soumya!";
    }

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run morning !!";
    }
    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Today is your lucky day !!";
    }

}
