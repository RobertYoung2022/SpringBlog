package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class PostController {
    @RequestMapping(path = "/posts", method = RequestMethod.GET) //
    @ResponseBody
    public String posts() {

        return "Here is my first post";
    }

    @RequestMapping(path = "/posts/{id}", method = RequestMethod.GET) //
    @ResponseBody
    public String id(@PathVariable String id) {

        return id;
    }

    @RequestMapping(path = "/posts/create", method = RequestMethod.GET) //
    @ResponseBody
    public String createPost() {

        return "here";
    }

    @PostMapping("/posts/create") //
    @ResponseBody
    public String blogPosts() {

        return "";
    }
}
