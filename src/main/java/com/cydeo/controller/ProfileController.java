package com.cydeo.controller;

import com.cydeo.model.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
public class ProfileController {

    @RequestMapping("/profile")
    public String profile(Model model){

        Profile profile = new Profile("John","Doe","johndoe","johndoe@cydeo.com","0123456789", LocalDateTime.now());
        model.addAttribute("profile",profile);

        return "profile/profile-info";
    }

}
