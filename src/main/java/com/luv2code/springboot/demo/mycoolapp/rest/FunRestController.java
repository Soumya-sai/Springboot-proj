package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String sayHello(){
        return  "hello soumya!";
    }

    @GetMapping("/workout")
    public String getDailyworkout(){
        return "run a hard!";
    }
    @GetMapping("/fortune")
    public String getFortune(){
        return "today your great day!!!!";
    }

}
