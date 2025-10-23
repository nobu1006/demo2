package com.example.demo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/multi")
public class MultiTableController {

    @RequestMapping("")
    public String index() {
        return "multi_input";
    }

    @RequestMapping("/exec")
    public String exec(String num, Model model) {
        int numInt = Integer.parseInt(num);
        long[][] kuku = new long[numInt][numInt];
        for (int i =0; i < numInt; i++) {
            for (int j = 0; j < numInt; j++) {
                kuku[i][j] = (i+1) * (j+1);
            }
        }
        model.addAttribute("kuku", kuku);
        return "multi_result";
    }

}
