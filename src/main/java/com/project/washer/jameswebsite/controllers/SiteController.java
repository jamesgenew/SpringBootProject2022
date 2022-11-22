package com.project.washer.jameswebsite.controllers;

import com.project.washer.jameswebsite.util.SiteMappings;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@ComponentScan("com.project.washer.jameswebsite")
public class SiteController {
    //--Request Methods--
    @GetMapping(SiteMappings.HOME)
    public String getHome(){
        return SiteMappings.HOME;
    }
    @GetMapping(SiteMappings.CREATEACCOUNT)
    public String getCreateAccount(){
        return SiteMappings.CREATEACCOUNT;
    }
    @GetMapping(SiteMappings.LOGIN)
    public String getLogin(){
        return SiteMappings.LOGIN;
    }
    @PostMapping(SiteMappings.REGISTER)
    public String createAccount(){
        return SiteMappings.REDIRECT_REGISTER;
    }
}
