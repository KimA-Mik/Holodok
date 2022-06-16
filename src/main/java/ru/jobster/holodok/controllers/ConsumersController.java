package ru.jobster.holodok.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "consumers")
public class ConsumersController {
    @GetMapping("")
    public String consumersPage(Model model){
        return "consumers/main";
    }
}
