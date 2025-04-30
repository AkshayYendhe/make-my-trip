package com.example.make_my_trip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class train {
    public train() {
    }

    @GetMapping({"/train"})
    public String getData() {
        return "Please book your train from make my trip kindly book ticket for New Delhi to anywhere at 10% discount";
    }
}