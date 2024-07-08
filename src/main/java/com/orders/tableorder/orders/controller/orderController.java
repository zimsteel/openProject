package com.orders.tableorder.orders.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class orderController {

    @GetMapping(value = "/orders")
    public String home(Model model){
        model.addAttribute("order", "주문화면!");
        return "order";
    }
}
