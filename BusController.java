package com.quickbus.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/buses")
public class BusController {
    @GetMapping
    public String getAllBuses() {
        return "All buses listed here.";
    }
}