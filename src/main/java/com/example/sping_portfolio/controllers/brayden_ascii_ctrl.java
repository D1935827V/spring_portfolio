package com.example.sping_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.sping_portfolio.Ascii.AsciiArt;
import com.example.sping_portfolio.Ascii.Picture;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;


public class brayden_ascii_ctrl {
    @Controller
    public class ascii_ctrl {
        @GetMapping("/AsciiArt")
        public String ascii(/* @RequestParam(name="image") MultipartFile image, Model model*/) {
            return "/ascii";
        }
    }
}


