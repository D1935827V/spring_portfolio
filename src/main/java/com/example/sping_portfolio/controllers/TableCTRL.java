package com.example.sping_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class TableCTRL {
    @GetMapping("/Table")    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String TableCTRL(@RequestParam(name="CalcAB", required=false, defaultValue= "false") boolean CalcAB,
                            @RequestParam(name="APBio", required=false, defaultValue= "false") boolean APBio,
                            @RequestParam(name="APUSH", required=false, defaultValue="false") boolean APUSH,
                            @RequestParam(name="APLIT", required=false, defaultValue="false") boolean APLIT,
                            @RequestParam(name="APStats", required=false, defaultValue="false") boolean APStats,
                            @RequestParam(name="APChem", required=false, defaultValue="false") boolean APChem,
                            Model model) {
        String over = "too little";
        int classes = 0;
        List<List<String>> schedule = new ArrayList<List<String>>();
        if (CalcAB) {
            schedule.add(Arrays.asList("AP Calculus AB 1", "AP Calculus AB 2", "AB Seminar"));
            classes = classes + 3;
        }
        if (APBio) {
            schedule.add(Arrays.asList("AP Bio 1", "AP Bio 2", "Bio Seminar"));
            classes = classes + 3;
        }
        if (APUSH) {
            schedule.add(Arrays.asList("APUSH 1", "APUSH 2", "APUSH Seminar"));
            classes = classes + 3;
        }
        if (APLIT) {
            schedule.add(Arrays.asList("APLIT 1", "APLIT 2", "APLIT Seminar"));
            classes = classes + 3;
        }
        if (APStats) {
            schedule.add(Arrays.asList("AP Stats 1", "AP Stats 2", "Stats Seminar"));
            classes = classes + 3;
        }
        if (APChem) {
            schedule.add(Arrays.asList("AP Chem 1", "AP Chem 2", "Chem Seminar"));
            classes = classes + 3;
        }
//        if (AMLIT) {
//            schedule.add(Arrays.asList("AMLIT 1", "AMLIT 2"));
//            classes = classes + 2;
//        }
        if (classes > 15) {
            over = "too many";
        }
        if (classes == 15) {
            over = "the right amount of";
        }

        model.addAttribute("over", over);
        model.addAttribute("classes", classes);
        model.addAttribute("schedule", schedule);
        return "Table"; // returns HTML VIEW (greeting)

    }
}
