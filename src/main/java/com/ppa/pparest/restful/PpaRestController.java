package com.ppa.pparest.restful;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pb")
public class PpaRestController {

    //ppa endpoint

    //Address to access this endpoint: http://localhost:8080/pb/ppa


    @GetMapping("/ppa")
    public String helloPpa(){
        return "Hello, and Welcome to the Pet Planet Adoption Web Application!";
    }
}
