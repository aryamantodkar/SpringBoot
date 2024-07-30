package com.p1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {
    @GetMapping(value = "/hussain")
    public String helloworldHussain() {
        return "Hello World!!";
    }

    @GetMapping(value = "/Greet")
    public String Greeting() {
        return "Hello World from prakhar!!";
    }

}