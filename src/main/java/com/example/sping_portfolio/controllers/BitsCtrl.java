package com.example.sping_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class BitsCtrl {
    @GetMapping("/CalvinML2")    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String greeting(@RequestParam(name="bitz", required=false, defaultValue="8") int bitz, Model model) {
        // @RequestParam handles required and default values, name and model are class variables, model looking like JSON
        if (bitz == 24){
            String change_img = "images/Dane.jpg";

        } else{
            String change_img = "/images/bulb_off.png";
        }
        String change_img = "/images/bulb_off.png";
        model.addAttribute("change_img", change_img);
        model.addAttribute("bitz", bitz);; // MODEL is passed to html
        return "CalvinML2"; // returns HTML VIEW (greeting)

    }
}