package com.grimaldi.first_spring_app.controller;

import com.grimaldi.first_spring_app.domain.User;
import com.grimaldi.first_spring_app.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Peu-gay")
public class HelloWorldController {

    @Autowired
    private  HelloWorldService helloWorldService;

    @GetMapping
    //GET no endpoint /hello-world
    public String helloWorld() {
        return helloWorldService.helloWorld("João");
    }

    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable("id" +
            "") String id  ,@RequestBody User body) {
        return  "Hello World " + body.getName();
    }
}
