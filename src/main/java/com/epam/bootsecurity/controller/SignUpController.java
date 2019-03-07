package com.epam.bootsecurity.controller;

import com.epam.bootsecurity.form.UserForm;
import com.epam.bootsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignUpController {

    @Autowired
    private UserService userService;

    @GetMapping("/signUp")
    public String getSignUpPage(){
        return "/signUp";
    }

    @PostMapping("/signUp")
    public String signUp(UserForm userForm){

        userService.signUp(userForm);
        return "redirect:/login";
    }
}
