package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class PostController {

    private final PostRepository postDao;

    public PostController(PostRepository postDao) {
        this.postDao = postDao;
    }

    @RequestMapping(path = "/posts", method = RequestMethod.GET) //
    @ResponseBody
    public String posts() {

        return "Here is my first post";
    }

    @RequestMapping(path = "/posts/{id}")
    @ResponseBody
    public String id(@PathVariable Long id) {

        return "Future page to show off id: " + id;
    }
    // EXAMPLE OF FUTURE GET-POST REQUEST
    @RequestMapping(path = "/posts/create", method = RequestMethod.GET)
    @ResponseBody
    public String createPost(Model model) {
        model.addAttribute("newPost", new Post());
        return "posts/create";
//        return "Form for creating a post - pardon our dust!"; // THIS WILL BE WHERE FORM WILL BE INSERTED
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String submitPost() {

        return "create a new post";
    }
}
