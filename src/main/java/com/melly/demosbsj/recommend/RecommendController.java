package com.melly.demosbsj.recommend;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/recommend")
public class RecommendController {
    @GetMapping("/spotMain")
    public String hello(Model model) {
        model.addAttribute("name", "John Doe");
        model.addAttribute("date", java.time.LocalDate.now().toString());
        return "spotMain";
    }

}
