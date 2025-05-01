package com.example.make_my_trip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sample {
    public sample() {
    }

    @GetMapping({"/sample"})
    public String getData() {
        return "Please booking your sample from makemytrip kindly book ticket for New Delhi to anywhere at 10% discount";
    }
}