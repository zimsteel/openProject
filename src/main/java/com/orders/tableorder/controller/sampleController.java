package com.orders.tableorder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class sampleController {

    // @GetMapping(value="/")
    // public String getMethodName(@RequestParam String param) {
    //     return new String();
    // }

    @GetMapping(value="/")
    public String home(Model model) {
        model.addAttribute("steel", "spring boot 설정 테스트!!!");
        return "index";
    }
    
}
