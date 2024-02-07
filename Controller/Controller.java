package com.example.demo.Controller;

import ch.qos.logback.core.model.Model;
import com.example.demo.entity.Image;
import com.example.demo.entity.User;
import com.example.demo.repository.ImageRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.services.Service;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    Service service;

    @GetMapping("/index")
    public String index(){

        return "index";
    }


    @PostMapping("/action1")
    public String signup(@ModelAttribute("user") User user){
        service.signup(user);
        return "redirect:index";
    }

   /*@PostMapping("/action2")
   public String signin(@ModelAttribute("user") User user, HttpSession session) {
       User loggedInUser = Service.login(user.getEmail(), user.getPassword());

       if (loggedInUser != null) {
           // Set user in session or perform authentication as needed
           return "redirect:/main";
       } else {
           // Handle invalid login
           return "index";
       }
   }*/

    @PostMapping("/action2")
    public String signin(){

        return "main";
    }


    @GetMapping("/upload")
    public String upload(){

        return "upload";
    }


    @Autowired
    ImageRepository imageRepository;
    @PostMapping("/uploadimage")
    public String handleFileUpload(@ModelAttribute Image image)
    {

        imageRepository.save(image);

        return "redirect:/upload";
    }


}
