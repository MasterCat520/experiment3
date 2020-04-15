package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TaskController {
    @RequestMapping("/")
    public String welcome() {
        return "welcome";
    }

}
