package com.melly.demosbsj.recommend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/recommend/hello")
    public String hello(){
        return "/recommend/hello";
    }

}
