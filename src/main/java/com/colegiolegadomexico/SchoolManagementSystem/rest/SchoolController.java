package com.colegiolegadomexico.SchoolManagementSystem.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SchoolController {

    @GetMapping("/")
    public String redirectToHome() {
        return "redirect:/colegiolegadomexico";
    }

    @GetMapping("/colegiolegadomexico")
    public String showHome(){

        return "school";
    }



    @GetMapping("/colegiolegadomexico/staff")
    public String showLeaders(){

        return "staff";
    }

    @GetMapping("/colegiolegadomexico/students")
    public String showSystems(){

        return "students";
    }

    // You can create other methods here if needed
}

