package com.codeup.springblog;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MathController {
    @RequestMapping(path = "/add/{numOne}/and/{numTwo}", method = RequestMethod.GET) //
    @ResponseBody
    // ADDITION METHOD
    public String addNum(@PathVariable int numOne, @PathVariable int numTwo) {

        return "Here is the total of " + numOne + " + " + numTwo + " = " + (numOne + numTwo);
    }
    // SUBTRACTION METHOD
    @RequestMapping(path = "/subtract/{numOne}/from/{numTwo}", method = RequestMethod.GET) //
    @ResponseBody
    public String subNum(@PathVariable int numOne, @PathVariable int numTwo) {

        return "Here is the total of " + numOne + " - " + numTwo + " = " + (numOne - numTwo);
    }

    // MULTIPLY METHOD
    @RequestMapping(path = "/multiply/{numOne}/and/{numTwo}", method = RequestMethod.GET) //
    @ResponseBody
    public String multipleNum(@PathVariable int numOne, @PathVariable int numTwo) {

        return "Here is the total of " + numOne + " * " + numTwo + " = " + (numOne * numTwo);
    }
    // DIVISION METHOD
    @RequestMapping(path = "divide/{numOne}/by/{numTwo}", method = RequestMethod.GET) //
    @ResponseBody
    public String divideNum(@PathVariable int numOne, @PathVariable int numTwo) {

        return "Here is the total of " + numOne + " / " + numTwo + " = " + ((double)numOne / (double)numTwo);
    }
}
