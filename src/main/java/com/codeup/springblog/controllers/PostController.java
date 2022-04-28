/*
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
*/
package com.codeup.springblog.controllers;

import com.codeup.springblog.Post;
//import com.codeup.springblog.model.Post;
//import com.codeup.springblog.model.User;
import com.codeup.springblog.repository.PostRepository;
//import com.codeup.springblog.repositories.UserRepository;
//import com.codeup.springblog.serivces.EmailService;
//import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController<UserRepository, EmailService> {
    private final PostRepository postDao;
//    private final UserRepository userDao;
//    private final EmailService emailService;

    public PostController(PostRepository postDao) {
        this.postDao = postDao;
//        this.userDao = userDao;
//        this.emailService = emailService;
    }

    @GetMapping("/posts")
    public String index(Model model) {
        model.addAttribute("posts", postDao.findAll());
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String individualPost(@PathVariable long id, Model model){
        model.addAttribute("post", postDao.findById(id));
        return "posts/show";
    }

    @GetMapping("/posts/{id}/edit")
    public String updatePost(@PathVariable("id") long id, Model model){
        Post editPost = postDao.findById(id);                     //saving the post id to variable
        model.addAttribute("post", editPost);       //pass variable to addAttribute
        return "posts/edit";
    }

    @PostMapping("/posts/edit")
    public String editPost(@ModelAttribute Post post) {
        postDao.save(post);                                 //save post in previous post's stead
        return "redirect:/posts";
    }

    @GetMapping(path = "/posts/create")
    public String createPostForm(Model model) {
        model.addAttribute("newPost", new Post());
        return "posts/create";
    }

//    @PostMapping (path= "/posts/create")
//    public String CreatePostView(@ModelAttribute Post newPost) {
////        newPost.setUser(userDao.getUserById(1L)); // let's see if 1L works, could've been previous error
//        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//        newPost.setUser(user);
//        emailService.prepareAndSend(newPost, "New ad created", "Your new Ad has been created on the Spring AdLister!");
//        postDao.save(newPost);
//        return "redirect:/posts";
//    }

//    @GetMapping(path= "/posts/{id}/delete")
//    public String deletePost(@ModelAttribute Post post) {
//        postDao.delete(post);                                 //save post in previous post's stead
//        return "redirect:/posts";
//    }
}