package com.chemdet.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NewsController {

    @RequestMapping(value = "/news.html")
    public String news() {

        return "news";
    }
}
