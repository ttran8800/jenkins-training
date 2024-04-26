package com.ttran.jenkins.training;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/api/printHello")
    public String printHello() {
        return "From jenkin-training spring boot app";
    }
}
