package com.example.sping_portfolio.controllers;
/* MVC code that shows defining a simple Model, calling View, and this file serving as Controller
 * Web Content with Spring MVCSpring Example: https://spring.io/guides/gs/serving-web-con
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import static java.lang.Math.pow;
import static com.example.sping_portfolio.controllers.recursive.sum;


@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class MiniLab4 {
    @GetMapping("/MiniLab4")    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String greeting(@RequestParam(name="number", required=false, defaultValue="0") int number, Model model) {
        // @RequestParam handles required and default values, name and model are class variables, model looking like JSON
        long factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial = factorial * i;
        }
        long geometric = 1;
        geometric = (long) pow(2, (number-1));

        int recursive_geometric = recursive.sum(number);

        model.addAttribute("factorial", factorial); // MODEL is passed to html
        model.addAttribute("geometric", geometric); // MODEL is passed to html
        model.addAttribute("recursive_geometric", recursive_geometric); // MODEL is passed to html

        return "MiniLab4"; // returns HTML VIEW (greeting)
    }
}