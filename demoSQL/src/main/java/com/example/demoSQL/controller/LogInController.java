package com.example.demoSQL.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import com.example.demoSQL.service.*;

@Controller
@RequestMapping("/login")
public class LogInController {

    @Autowired
    LogInService service;

    @RequestMapping(value="", method = RequestMethod.GET)
    public String showLoginPage(ModelMap model){
        return "login";
    }

    @RequestMapping(value="", method = RequestMethod.POST)
    public String showWelcomePage(ModelMap model, @RequestParam String id, @RequestParam String password){

        boolean isValidUser = service.validateUser(id, password);

        if (!isValidUser) {
            model.put("errorMessage", "Invalid Credentials");
            return "login";
        }

        model.put("username", id);
        model.put("password", password);

        return "successLogin";
    }

}
