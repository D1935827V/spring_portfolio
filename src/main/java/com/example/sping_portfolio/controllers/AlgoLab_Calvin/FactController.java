package com.example.sping_portfolio.controllers.AlgoLab_Calvin;

import com.example.sping_portfolio.controllers.AlgoLab_Calvin.FactorialModel.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class FactController {

    public List<_Factorial> fibInit(int nth) {
        //Fibonacci objects created with different initializers
        List<_Factorial> fibList = new ArrayList<>();
        fibList.add(new FactFor(nth));
        fibList.add(new FactWhile(nth));
        fibList.add(new FactRecurse(nth));
        fibList.add(new FactStream(nth));

        return fibList;
    }

    // GET request,, parameters are passed within the URI
    @GetMapping("/AlgoExtendLab_Calvin")
    public String fib(@RequestParam(name="fibs", required=false, defaultValue="2") String fibs, @RequestParam(name="SLC", required=false,  defaultValue="") String SLC, Model model) {
        //nth is fibonacci request
        int nth = Integer.parseInt(fibs);
        if (Objects.equals(SLC, "")) {
            nth = Integer.parseInt(fibs);
        }
        else {
             nth = SLC.length();
        }




        //MODEL attributes are passed back html
        model.addAttribute("fibList", fibInit(nth));

        return "/AlgoExtendLab_Calvin"; //HTML render fibonacci results

    }



    // Console UI is run out of the same Controller
    public static void main(String[] args) {
        int nth = 20; //!!!make dynamic using consoleUI inputInt!!! 92 is max for long

        List<_Factorial> fibList = new FactController().fibInit(nth);
        for (_Factorial fibonacci : fibList)
            fibonacci.print();  //Console output fibonacci results
    }
}