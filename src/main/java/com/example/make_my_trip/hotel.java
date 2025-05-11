package com.example.make_my_trip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hotel {
    public hotel() {
    }

    @GetMapping({"/hotel"})
    public String getData() {
        return "Please book your hotels from MMT kindly book ticket for New Delhi to anywhere at 30% discount";
    }
}