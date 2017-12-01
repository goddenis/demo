package com.example.demo;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class IndexController {

    @PreAuthorize("hasRole('BAR_ROLE')")
    @GetMapping
    public String principal() {

        return "ssasasas";

    }
}
