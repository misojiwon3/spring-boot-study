package me.hanseung.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TemplateController {

    @GetMapping("/template")
    public String hello(Model model) {
        model.addAttribute("name", "hanseung");
        return "hello";
    }
}
