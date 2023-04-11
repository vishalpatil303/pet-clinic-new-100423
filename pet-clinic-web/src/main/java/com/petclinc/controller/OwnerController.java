package com.petclinc.controller;

import com.petclinc.model.Owner;
import com.petclinc.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

@Controller
@RequestMapping("/owner")
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @GetMapping("/")
    public String getOwner(Model model){
        Set<Owner> owners = ownerService.findAll();
        model.addAttribute("owners",owners);
        model.addAttribute("title","Owner List");
        return "owner";
    }
}
