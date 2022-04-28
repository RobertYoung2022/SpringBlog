package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class DiceController {

    // VIEW THE MAIN PAGE FOR DICE
    @GetMapping("/roll-dice/")
    public String rollDice(){
            return "dice";
    }

    // VIEW THE PAGE FOR THE DICE ROLLED
    @GetMapping("/roll-dice/{number}")
    public String diceRolled(@PathVariable int number, Model model) {

        int randomNum = (int)Math.floor(Math.random()* (6 - 1 + 1) + 1); // var to create random number sequence(s)

        String message = "";

        // if the random number(created my randomNum var) is the same as the number (selected by user)
        if(randomNum == number) {
            message = "Lucky Roll! You are CORRECT!";
        } else {
            message = "TRY AGAIN ;)";
        }

//        System.out.println("What did we get? RandomNum = " + randomNum + "; userNumber = " + number); // this was a check to see if the options are working in the dice.html view

        model.addAttribute("number", number);
        model.addAttribute("message", message);
        model.addAttribute("randomNum", randomNum);

        return "dice";
    }
}
