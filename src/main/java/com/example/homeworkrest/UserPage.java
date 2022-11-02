package com.example.homeworkrest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserPage {

    @RequestMapping("/user")
    public String printUserPageText() {
        return "User: Plamen Kostov <br>" + " Age: 18 <br>" + " From: Burgas";
    }
}
