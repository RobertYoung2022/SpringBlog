package com.codeup.springblog.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {
    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable String name, Model model) {
        model.addAttribute("yourName", name); //
        return "hello";
    }


    // This method setups the path and the is step 1 for this process > step 2 - join.html file
    @GetMapping("/join")
    public String showJoinForm() {
        return "join";
    }

    @PostMapping("/join") // Step 3: setup for the POST method and how to get information to display from the form to join page
    public String joinCohort(@RequestParam(name = "cohort") String cohort, Model model) {
        model.addAttribute("cohort", "Welcome to " + cohort + "!");
        return "join";
    }
}


