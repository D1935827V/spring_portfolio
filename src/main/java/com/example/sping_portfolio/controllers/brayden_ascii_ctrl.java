package com.example.sping_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

public class brayden_ascii_ctrl {
    @Controller
    public class ascii_ctrl {
        @GetMapping("/AsciiArt")
        public String ascii(/* @RequestParam(name="image") MultipartFile image, Model model*/) {
            return "/ascii";
        }
    }
}


