package com.codeup.springblog;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MathController {
    @RequestMapping(path = "/add/{numOne}/and/{numTwo}", method = RequestMethod.GET) //
    @ResponseBody
    public Integer addNum(@PathVariable int numOne, @PathVariable int numTwo) {

        return numOne + numTwo;
    }

    @RequestMapping(path = "/subtract/{numOne}/from/{numTwo}", method = RequestMethod.GET) //
    @ResponseBody
    public Integer subNum(@PathVariable int numOne, @PathVariable int numTwo) {

        return numOne - numTwo;
    }

    @RequestMapping(path = "/multiply/{numOne}/and/{numTwo}", method = RequestMethod.GET) //
    @ResponseBody
    public Integer multipleNum(@PathVariable int numOne, @PathVariable int numTwo) {

        return numOne * numTwo;
    }

    @RequestMapping(path = "divide/{numOne}/by/{numTwo}", method = RequestMethod.GET) //
    @ResponseBody
    public Integer divideNum(@PathVariable int numOne, @PathVariable int numTwo) {

        return numOne / numTwo;
    }
}
