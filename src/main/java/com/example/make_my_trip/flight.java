package com.example.make_my_trip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class flight {
    public flight() {
    }

    @GetMapping({"/flight"})
    public String getData() {
        return "Please book your flight from Indigo kindly book ticket for New Delhi to anywhere at 10% discount";
    }
}