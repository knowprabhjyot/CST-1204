package com.springbootapp1.springbootapp1.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/user")
public class UserController {

    @RequestMapping("/register")
    public String register() {
        return "<form action=\"/user/success\" method=\"POST\"><h1>Register Page</h1>"
                +
                "<label for=\"name\">User Name </label><br>"
                +
                "<input type=\"text\" name=\"name\" placeholder=\"Enter Name\"><br><br>"
                +
                "<label for=\"email\">User Email </label><br>"
                +
                "<input type=\"email\" name=\"email\" placeholder=\"Enter Email\"><br><br>"
                +
                "<label for=\"password\">User Password </label><br>"
                +
                "<input type=\"password\" name=\"password\" placeholder=\"Enter Password\"><br><br>"
                +
                "<input type=\"submit\" id=\"submit\" value=\"submit\"><br>"
                +
                "</form>";
    }

    // Add Login Details
    @RequestMapping("/login")
    public String login() {
        return "<h1>LoginPage</h1>";
    }

    @RequestMapping(value = "/success", method = RequestMethod.POST)
    public String success(@RequestParam String name, @RequestParam String email, @RequestParam String password) {
        return "<h1>Hey " + name + " your registered email with us is :" + email + " </h1>";
    }

    @RequestMapping("/{id}")
    public String showUserDetail(@PathVariable String id) {
        return "<h1> Here are the details of user with ID " + id + "</h1>";
    }

}
