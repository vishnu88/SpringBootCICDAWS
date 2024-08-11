package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstController {
    @GetMapping(path = "/getName")
    String getName(){
        return  "Vishnu";
    }
}
