package com.example.demo.Service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String handleHello(String value) {
        if(value.equals("thao")) {
            return "chi thao";
        } else {
            return value;
        }
    }
}
