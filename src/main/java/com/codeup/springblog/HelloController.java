package com.codeup.springblog;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable String name, Model model) {
        model.addAttribute("enteredName", name); //
        return "hello";
    }
}


//TESTING MULTIPLE METHODS IN ONE CONTROLLER
//@RequestMapping("/first/{firstName}")
//public String firstName(@PathVariable String firstName, Model model) {
//    model.addAttribute("firstName", firstName); //
//    return "first";
//}
//    @RequestMapping("/last/{lastName}")
//    public String sayHello(@PathVariable String lastName, Model model) {
//        model.addAttribute("lastName", lastName); //
//        return "last";
//    }

