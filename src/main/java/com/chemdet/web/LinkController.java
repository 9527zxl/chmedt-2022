package com.chemdet.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LinkController {

    @RequestMapping(value = "/link.html")
    public String link() {

        return "link";
    }
}
