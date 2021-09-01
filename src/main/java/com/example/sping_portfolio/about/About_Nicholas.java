package com.example.sping_portfolio.about;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class About_Nicholas {
    @GetMapping("Abouts/Nicholas")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String Nicholas() {
        return "Abouts/Nicholas"; // returns HTML VIEW (greeting)
    }
}

