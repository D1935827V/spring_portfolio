package com.example.sping_portfolio.controllers;

        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class brayden_factorial {
    @GetMapping("/brayden_factorial.html")
    public int brayden_factorial(@RequestParam(name = "n", required = false, defaultValue = "8") int n, Model model) {
            if (n == 0) {
                return 1;
            }
            else
                return (n * Factorial.factorial(n - 1));
        }
        public static void main (String args[]){
            int i, fact = 1;
            int number = 4;
            fact = factorial(number);
            System.out.println("Factorial of " + number + " is: " + fact);
        }
    }
}
