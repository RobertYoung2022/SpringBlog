package com.codeup.springblog.controllers;

import com.codeup.springblog.AdRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdController {
    private final AdRepository adDao;

    // CONSTRUCTOR
    public AdController(AdRepository adDao) {
        this.adDao = adDao;
    }

//    @GetMapping("/ads")
//    public String index(Model model) {
//        model.addAttribute("ads", adDao.findAll());
//        return "ads/index";
//    }

    @GetMapping("/ad")
    public String getAd(Model model) {
        model.addAttribute("ad", adDao.findAll());
        return "adPage"; // return the "name" of the html file is
    }
}
