package com.example.sping_portfolio.about;

import com.example.sping_portfolio.Palindrome.PalindromeRecursive;
import com.example.sping_portfolio.Palindrome.PalindromeWhile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class About_Nicholas {
    @GetMapping("/Abouts/Nicholas")
    public String Nicholas() {
        return "/Abouts/Nicholas";
    }
}