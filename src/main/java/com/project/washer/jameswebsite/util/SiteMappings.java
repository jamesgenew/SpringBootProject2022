package com.project.washer.jameswebsite.util;

import org.springframework.stereotype.Component;

@Component
public class SiteMappings {
    public static final String HOME = "home";
    public static final String CREATEACCOUNT = "createaccount";
    public static final String MENU = "menu";
    public static final String REGISTER = "register";
    public static final String LOGIN = "login";
    public static final String REDIRECT_REGISTER = "redirect:/" + LOGIN;

    private SiteMappings(){}
}
