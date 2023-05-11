package com.chemdet.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Product_viewController {
    @RequestMapping(value = "/product_view.html")
    public String product_view() {

        return "product_view";
    }
}
