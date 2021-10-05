package com.example.sping_portfolio.controllers;

import com.example.sping_portfolio.Palindrome.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PalindromeController {
    public List<_Palindrome> PalInit(String p) {
        List<_Palindrome> palindromeList = new ArrayList<>();
        palindromeList.add(new PalindromeFor(p));
        palindromeList.add(new PalindromeWhile(p));
        palindromeList.add(new PalindromeRecursive(p));
        palindromeList.add(new PalindromeArray(p));
        return palindromeList;
    }
    @GetMapping("/Palindrome")
    public String Palindrome(@RequestParam(name="phrase", required = false, defaultValue = "racecar") String phrase, Model model) {
        model.addAttribute("palindromeList", PalInit(phrase));
        return "/Palindrome";
    }
}
