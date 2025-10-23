package com.example.demo2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo2.domain.User;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/ex16")
public class Ex16Controller {

    @Autowired
    private HttpSession session;

    @RequestMapping("")
    public String index() {
        @SuppressWarnings("unchecked")
        List<User> userList = (List<User>) session.getAttribute("userList");
        if (userList == null) {
            userList = new ArrayList<>();
            session.setAttribute("userList", userList);
        }
        return "ex-16";
    }
    @RequestMapping("/post")
    public String post(String name, String comment) {
        @SuppressWarnings("unchecked")
        List<User> userList = (List<User>) session.getAttribute("userList");
        userList.add(0,new User(name, comment));
        return "redirect:/ex16";
    }
}
