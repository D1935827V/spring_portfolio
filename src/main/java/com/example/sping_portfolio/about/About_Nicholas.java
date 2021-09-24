package com.example.sping_portfolio.about;

import com.example.sping_portfolio.Palindrome.Palindrome;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class About_Nicholas {
    @GetMapping("/Abouts/Nicholas")
    public String Nicholas(@RequestParam(name = "phrase", required = false, defaultValue = "") String phrase, Model model) {
        Palindrome check = new Palindrome();
        model.addAttribute("log1", check.isPalindrome(phrase));
        return "/Abouts/Nicholas";
    }
}