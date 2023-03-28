package com.springbootapp1.springbootapp1.web;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springbootapp1.springbootapp1.domain.Post;

@RestController
@RequestMapping("/")
public class HomeController {

    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        return "<h1>Home Page</h1>";
    }

    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    public List<Post> displayAllPosts() {
        return Arrays.asList(
            new Post(1, "Post 1", "Post 1 Description"),
            new Post(2, "Post 2", "Post 2 Description"),
            new Post(3, "Post 3", "Post 3 Description"),
            new Post(4, "Post 4", "Post 4 Description")
        );
    }

}
