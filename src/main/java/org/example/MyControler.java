package org.example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyControler {
    @GetMapping("/")
    public String index(){
        return "Greetings from Spring Boot, with Web Hook!\nNow testing mid run";
    }
}
