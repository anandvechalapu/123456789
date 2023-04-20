package com.123456789.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.123456789.service.LogoutService;

@Controller
public class LogoutController {

    @Autowired
    private LogoutService logoutService;

    @GetMapping("/logout")
    public ModelAndView logout(Authentication authentication) {
        return logoutService.logout(authentication);
    }
}