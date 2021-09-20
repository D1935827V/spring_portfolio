package com.example.sping_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class RevCTRL {
    @GetMapping("/Project")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String Project(@RequestParam(name="review", required=false, defaultValue="") String review, Model model) {
        // @RequestParam handles required and default values, name and model are class variables, model looking like JSON\
        String last_review = review;
        String all_reviews = "";
        review = "<br>" + review;
        if (!review.equals("")){
            all_reviews = all_reviews + review;
        }
        model.addAttribute("review", review); // MODEL is passed to html
        model.addAttribute("all_reviews", all_reviews);
        return "Project"; // returns HTML VIEW (greeting)
    }
}
