package com.colegiolegadomexico.SchoolManagementSystem.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/lm-login")
    public String LM_Login(){

        //return "plain-login";
        return "fancy-login";
    }

    //add access denied page
    @GetMapping("/access-denied")
    public String showAccessDenied(){

        //return "plain-login";
        return "access-denied";
    }

    // You can create other methods here if needed
}
