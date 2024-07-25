package com.p1.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsCOntroller {
    @GetMapping(value = "/hussain")
    public String helloworldHussain() {
        return "Hello World!!";
    }

}