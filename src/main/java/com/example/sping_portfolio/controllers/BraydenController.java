package com.example.sping_portfolio.controllers;

import com.example.sping_portfolio.Palindrome.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
@Controller
public class BraydenController {

        @GetMapping("/braydenlabfactorial")
        public String Palindrome() {
            return "brayden_algorithm/brayden_factorial.html";
        }
    }

