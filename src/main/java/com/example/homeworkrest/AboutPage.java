package com.example.homeworkrest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AboutPage {

    @RequestMapping("/about")
    public String printAboutPageText() {
        return "<body style=\"background-image: url('https://www.thehumanfront.com/assets/PocketsizedPhilosophy/22%20Ethics%20in%20American%20Psycho/pat_bateman.jpg')\"> </body>" +
                "<style> body {  margin: 0; font-family: Arial, Helvetica, sans-serif; } .topnav {overflow: hidden;  background-color: #333;} .topnav a {float: left;color: #f2f2f2;text-align: center;padding: 14px 16px;text-decoration: none; font-size: 17px; }  .topnav a:hover {background-color: #ddd;color: black;} .topnav a.active {background-color: #04AA6D;color: white;}</style>" +
                "<div class=\"topnav\"> <a class=\"active\" href=\"/\">Main</a> <a class=\"active\" href=\"/home\">Home</a> <a href=\"/user\">User</a>  <a href=\"/contact\">Contact</a></div>" +
                "divak";
    }
}
