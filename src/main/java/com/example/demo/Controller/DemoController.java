package com.example.demo.Controller;

import com.example.demo.Service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class DemoController {

    private HelloService helloService;

    @Autowired
    public DemoController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping(value = "/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping(value = "/hello/{value}")
    public String helloFromAnotherSide(@PathVariable("value") String value) {
        String finalValue = helloService.handleHello(value);
        return "hello " + finalValue;
    }
}
