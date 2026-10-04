package com.example.employee;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class EmployeeController {

    @GetMapping("/")
    public String home(Model model) {

        List<String> employees = List.of(
                "Arun - DevOps Engineer",
                "Rahul - Software Engineer",
                "Priya - Cloud Engineer"
        );

        model.addAttribute("employees", employees);

        return "index";
    }
}