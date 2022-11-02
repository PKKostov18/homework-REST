package com.example.homeworkrest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePage {

    @RequestMapping("/home")
    public String printHomePageText() {
        return "<body style=\"background-image: url('https://yt3.ggpht.com/wkP29nYAFA4Eyvi2Lgy14Ks-vjKSJWkqFVrPPwBpyxfDrNkzPCzvtHSAimEK552asb6pVZiCEw=s900-c-k-c0x00ffffff-no-rj')\"> </body>" +
                "<style> body {  margin: 0; font-family: Arial, Helvetica, sans-serif; } .topnav {overflow: hidden;  background-color: #333;} .topnav a {float: left;color: #f2f2f2;text-align: center;padding: 14px 16px;text-decoration: none; font-size: 17px; }  .topnav a:hover {background-color: #ddd;color: black;} .topnav a.active {background-color: #04AA6D;color: white;}</style>" +
                "<div class=\"topnav\"> <a class=\"active\" href=\"/\">Main</a> <a href=\"/user\">User</a> <a href=\"/contact\">Contact</a> <a href=\"/about\">About</a> </div>" +
                "Welcome user";
    }
}
