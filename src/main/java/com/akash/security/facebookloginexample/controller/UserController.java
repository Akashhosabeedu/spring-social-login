package com.akash.security.facebookloginexample.controller;


import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@RestController
public class UserController {




    @RequestMapping("/logintest")
    public ModelAndView firstPage() {
        return new ModelAndView("home.html");
    }

    @GetMapping("/login_success")
    public ModelAndView loginSuccess(OAuth2AuthenticationToken auth2AuthenticationToken) {
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        // Perform any necessary actions upon successful login
//        String name=authentication.getName();
        Map<String,Object> obj= auth2AuthenticationToken.getPrincipal().getAttributes();
        return new ModelAndView("dashoard.html");
//        return obj;
    }
}
