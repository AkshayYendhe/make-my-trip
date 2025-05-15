package com.example.make_my_trip;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class visa {
    public visa() {
    }

    @GetMapping({"/visa"})
    public String getData() {

        return "sample visa";

    }
}