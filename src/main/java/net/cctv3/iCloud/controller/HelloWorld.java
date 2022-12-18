package net.cctv3.iCloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/HelloWorld")
public class HelloWorld {
    @RequestMapping("/HelloWorld")
    @ResponseBody
    public String iCloud () {
        // http://localhost:8080/HelloWorld/HelloWorld
        return "HelloWorld";
    }
}