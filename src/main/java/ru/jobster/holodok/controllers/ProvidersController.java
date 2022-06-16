package ru.jobster.holodok.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "providers")
public class ProvidersController {
    @GetMapping("")
    public String providersPage(Model model){
        return "providers/main";
    }
}

