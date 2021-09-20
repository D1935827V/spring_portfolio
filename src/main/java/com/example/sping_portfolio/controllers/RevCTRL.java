package com.example.sping_portfolio.about;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class RevCTRL {
    @GetMapping("/Project")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String birds() {
        return "/Project"; // returns HTML VIEW (greeting)
    }
}
