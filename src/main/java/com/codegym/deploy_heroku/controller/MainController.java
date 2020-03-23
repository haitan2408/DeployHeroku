package com.codegym.deploy_heroku.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @GetMapping("/hello")
    public ModelAndView hello() {
        return new ModelAndView("index");
    }
}