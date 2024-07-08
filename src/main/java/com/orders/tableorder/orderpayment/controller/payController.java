package com.orders.tableorder.orderpayment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class payController {
    
    @GetMapping(value = "/orderpay")
    public String home(Model model){
        model.addAttribute("pay", "결제화면!!!");
        return "cash";
    }
}
