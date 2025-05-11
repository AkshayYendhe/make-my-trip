package com.example.make_my_trip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class holidays {
    public holidays() {
    }

    @GetMapping({"/holidays"})
    public String getData() {
        return "Please book your holidays package from MMT kindly book ticket for New Delhi to anywhere at 10% discount";
    }
}