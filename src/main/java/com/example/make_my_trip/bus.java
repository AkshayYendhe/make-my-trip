package com.example.make_my_trip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class bus {
    public bus() {
    }

    @GetMapping({"/bus"})
    public String getData() {
        return "Get Visa for 30 days";
    }
}