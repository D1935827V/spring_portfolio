package com.example.sping_portfolio.controllers;
/* MVC code that shows defining a simple Model, calling View, and this file serving as Controller
 * Web Content with Spring MVCSpring Example: https://spring.io/guides/gs/serving-web-con
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class Binary {
    @GetMapping("/MiniLab2")    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String greeting(@RequestParam(name="bits", required=false, defaultValue="8") int bits, Model model) {
        // @RequestParam handles required and default values, name and model are class variables, model looking like JSON
        model.addAttribute("bits", bits); // MODEL is passed to html
        String text = "";
        String page = "MiniLab2";
        if (bits == 8){
            text = "8 bits is pretty baller";
            page = "MiniLab2";
        }
        else if (bits == 9){
            page = "God_Calvin";
        }
        else{
            text = "";
            page = "MiniLab2";
        }
        model.addAttribute("bits", bits);
        model.addAttribute("text", text);
        return page; // returns HTML VIEW (greeting)
    }
}