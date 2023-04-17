package com.petclinc.controller;

import com.petclinc.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vet")
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @GetMapping({"/vets","/vets/index","/"})
    public String getVets(Model model){
        model.addAttribute("vets",vetService.findAll());
        model.addAttribute("title","Vet List");
        return "vet";
    }
}
