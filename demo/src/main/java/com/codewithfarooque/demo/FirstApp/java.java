package com.codewithfarooque.demo.FirstApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class java {

    @GetMapping("abc")

public  String sayHello(){
    return "Hello";
}
}
