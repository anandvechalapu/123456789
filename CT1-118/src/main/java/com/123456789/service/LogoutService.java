package com.123456789.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.web.servlet.ModelAndView;

import com.123456789.repository.LogoutRepository;

@Service
public class LogoutService {

    @Autowired
    private LogoutRepository logoutRepository;

    public ModelAndView logout(Authentication authentication) {
        SecurityContextLogoutHandler logoutHandler = new SecurityContextLogoutHandler();
        logoutHandler.logout(authentication.getRequest(), authentication.getResponse(), authentication);
        logoutRepository.deleteByUserId(authentication.getPrincipal().getId());
        return new ModelAndView("redirect:/login");
    }
}