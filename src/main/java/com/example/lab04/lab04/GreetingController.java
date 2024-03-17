package com.example.lab04.lab04;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

public class GreetingController {
    private static final String template = "Hello, %s!";

    private final AtomicLong count = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(){
        return new Greeting(count.incrementAndGet(),String.format(template, "World"));
    }

    @GetMapping ("/greeting/name")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "Uvindu Kavishka") String name){
        return new Greeting(count.incrementAndGet(),String.format(template,name));
    }
}
