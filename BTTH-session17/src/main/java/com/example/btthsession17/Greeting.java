package com.example.btthsession17;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class Greeting {
    @GetMapping("/greeting")
    public String greeting(){
        return "hello";
    }
    @GetMapping("/")
    public  String home(){
        return "home";
    }

}