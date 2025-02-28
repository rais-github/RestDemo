package net.engineeringdigest.Rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestCheck {
    @GetMapping("rest-api")
    public String check(){
        return "OK!";
    }
}
