package org.Jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.apache.catalina.Wrapper;
import org.apache.jasper.servlet.JspServlet;

@Controller
public class HelloController {

    @GetMapping("/")
    public String showHomePage(Model model){
        model.addAttribute("massage","Enter your name "); // open form enter your name
        return "Home"; // Spring mvc understood we want to return home view int fronted->create Home view

    }
    @PostMapping("/greet")
    public String greetuser(@RequestParam("name") String name /* jab bhi html se ati h to vo query parameter ke form me ati h */, Model model /* to get information */){
        model.addAttribute("massage", "hello "+name);
        return "Home";
    }
    // first call "/ then page open enter your name ->> then passage pammage through model and then autocall "/gree and massage print
}
