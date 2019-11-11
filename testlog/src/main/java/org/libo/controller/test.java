package org.libo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class test {
    @RequestMapping("request")
    public String request(){
        return "test";
    }
}
