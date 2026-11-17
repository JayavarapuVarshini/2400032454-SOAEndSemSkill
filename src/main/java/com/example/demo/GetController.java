package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {

    @GetMapping(value = "/get", produces = "text/plain;charset=UTF-8")
    public String get(@RequestParam String a, @RequestParam String b) {
        return "mz='1.1' addition=15";
    }
}
