package com.orders.tableorder.ordermenu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class menuConroller {

    @GetMapping(value = "/ordermenu")
    public String home(Model model){
        model.addAttribute("menu", "메뉴화면!!");
        return "menu";
    }
}
