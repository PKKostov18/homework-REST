package com.example.homeworkrest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserPage {

    @RequestMapping("/user")
    public String printUserPageText() {
        return "<style> body {  margin: 0; font-family: Arial, Helvetica, sans-serif; } .topnav {overflow: hidden;  background-color: #333;} .topnav a {float: left;color: #f2f2f2;text-align: center;padding: 14px 16px;text-decoration: none; font-size: 17px; }  .topnav a:hover {background-color: #ddd;color: black;} .topnav a.active {background-color: #04AA6D;color: white;}</style>" +
                "<div class=\"topnav\"> <a class=\"active\" href=\"/\">Main</a> <a class=\"active\" href=\"/home\">Home</a> <a href=\"/contact\">Contact</a> <a href=\"/about\">About</a> </div>" +
                "<body style=\"background-image: url('https://media.gq-magazine.co.uk/photos/62fa37b64c951e9b75502e9c/1:1/w_1080,h_1080,c_limit/Andrew-tate-e.jpg')\"> </body>User: Plamen Kostov <br> <hr style=\"background-color: grey; height: 50px\"> <br>" + " Age: 18 <br> <hr> <br>" + " From: Burgas <br> <hr> <br>";
    }
}
