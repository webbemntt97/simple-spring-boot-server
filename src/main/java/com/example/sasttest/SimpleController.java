package com.example.sasttest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    @GetMapping("/")
    public String index(@RequestParam(required = false) String name) {
        return "Hello " + name;
    }
}
