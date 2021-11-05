package com.example.sping_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class TikTacCTRL {
    @GetMapping("/TikTac")    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String TikTacCTRl(@RequestParam(name="boxCheck", required=false, defaultValue="") String boxCheck, Model model) {
        // @RequestParam handles required and default values, name and model are class variables, model looking like JSO
        model.addAttribute("boxCheck", boxCheck);
        return "TikTac"; // returns HTML VIEW (greeting)

    }
}