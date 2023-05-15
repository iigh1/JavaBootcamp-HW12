package com.example.testbootcamp.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping(path = "/get")
    public String helloWorld(){
        return "hello world";
    }

    @GetMapping(path = "/name")
    public String getName(){
        return "My Name is Ghadeer";
    }

    @GetMapping(path = "/age")
    public String getAge(){
        return "My age is 24";
    }
}
