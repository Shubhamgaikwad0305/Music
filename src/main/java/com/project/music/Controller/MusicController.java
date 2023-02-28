package com.project.music.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.project.music.bean.songs;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;


import com.project.music.service.songsservice;
import java.util.*;


@Controller
public class MusicController {
   
    @Autowired
    private songsservice service;

    @GetMapping("/home")
    public String home() {
        return "index";
    }
    
    @GetMapping("/aboutus")
    public String aboutus() {
        return "aboutus";
    }

    @GetMapping("/disclaimer")
    public String disclaimer() {
        return "disclaimer";
    }
    
    @GetMapping("/contactus")
    public String contactus() {
        return "contactus";
    }

    @GetMapping("/privacypolicy")
    public String privacypolicy() {
        return "privacypolicy";
    }

    @GetMapping("/termsofcondition")
    public String termsofcondition() {
        return "termsofcondition";
    }

    @GetMapping("/adminlogin")
    public String adminlogin() {
        return "adminlogin";
    }

    @PostMapping("/checklogin")
    public String checklogin(String username, String password) {
        if (username.equals("shubhamgaikwad")&& password.equals("remix")){
            return "uploadsong";
        }
        else {
            return "adminlogin";
        }

    }

    @PostMapping("/addsong")
    public String addsong(@ModelAttribute songs song) {
        service.addsong(song);
        return "uploadsong";
    }

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("all_songs", service.show());
        System.out.println(service.show());
        return "index";
    }
     

    @GetMapping("/secondpage")
    public String secondpage() {
        return "secondpage";
    }

    @GetMapping("/thirdpage")
    public String thirdpage() {
        return "thirdpage";
    }

    @GetMapping("/search")
    public List<songs> search() {
        List<songs> data = service.show();
        return data;
    }

    
}
