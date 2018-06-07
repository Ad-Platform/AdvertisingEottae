package com.within.producer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProducerController {

    @PostMapping("/")
    public String test() {
        return "";
    }
}
