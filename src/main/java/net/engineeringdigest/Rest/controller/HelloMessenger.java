package net.engineeringdigest.Rest.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloMessenger {

    @GetMapping
    public String welcomeAll(){
        return "HELLO, from BridgeLabz";
    }

    @GetMapping("query/{name}")
    public String WelcomeUser(@PathVariable String name){
        return "Hello "+name;
    }

    @GetMapping("param")
    public String greetWithRequestParam(@RequestParam String name){
        return "Hello, " + name + "! Nice to meet you.";
    }

}
