package net.engineeringdigest.Rest.controller;

import net.engineeringdigest.Rest.entity.Message;
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

    @PostMapping("post")
        public String greetWithRequestBody(@RequestBody Message names){
            return "Hello, "+names.getFirstName()+" "+names.getLastName();
    }

    @PutMapping("put/{firstName}")
    public String greetWithQueryAndParam(@RequestParam String lastName,@PathVariable String firstName){
        return "HELLO! "+firstName+" "+lastName;
    }
}
