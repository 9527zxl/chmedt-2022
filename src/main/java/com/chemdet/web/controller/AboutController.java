package com.chemdet.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AboutController {

    @RequestMapping(value = "/about.html")
    public String about() {

        return "about";
    }
}
