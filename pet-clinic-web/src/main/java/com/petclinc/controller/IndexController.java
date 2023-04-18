package com.petclinc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping({"/",""})
    public String getIndexPage(Model model){
        model.addAttribute("title","Pet Clinic Index Page");
        model.addAttribute("welcome","Welcome to Pet Clinic");
        return "index";
    }
}
