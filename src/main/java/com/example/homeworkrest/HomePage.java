package com.example.homeworkrest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePage {

    @RequestMapping("/home")
    public String printHomePageText() {
        return "Welcome user";
    }
}
