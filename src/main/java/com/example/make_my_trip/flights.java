package com.example.make_my_trip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class flights {
    public flights() {
    }

    @GetMapping({"/flights"})
    public String getData() {
        return "Please book your flights from MMT kindly book ticket for New Delhi to anywhere at 20% discount";
    }
}