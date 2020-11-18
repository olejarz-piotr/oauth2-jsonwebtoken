package pl.olejarz.oauth2jsonwebtoken;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/say")
    public String sayHello(){
        return "Hello";
    }
}
