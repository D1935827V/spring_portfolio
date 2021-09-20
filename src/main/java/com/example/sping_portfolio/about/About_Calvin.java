package com.example.sping_portfolio.about;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class About_Calvin {
    @GetMapping("Abouts/Calvin")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String abtCalvin(@RequestParam(name="name", required=false, defaultValue="brotha") String name, Model model) {
        // @RequestParam handles required and default values, name and model are class variables, model looking like JSON
        model.addAttribute("name", name); // MODEL is passed to html
        return "Abouts/Calvin"; // returns HTML VIEW (greeting)
    }
}

