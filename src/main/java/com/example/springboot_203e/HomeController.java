package com.example.springboot_203e;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @GetMapping("/loadform")
    public String loadFormPage(Model model) {
        model.addAttribute("employee", new employee());
        return "employeeform";
    }
    @PostMapping("/employeeform")
    public String loadfromPage(@ModelAttribute employee employee, Model model) {
        model.addAttribute("employee", employee);
        return "confirm";
    }
}
