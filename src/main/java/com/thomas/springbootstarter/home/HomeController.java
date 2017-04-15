package com.thomas.springbootstarter.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @RequestMapping("/")
    public @ResponseBody String greeting() { //@Controller + @ResponseBody is equivalent to @RestController. 
        return "springAppData-api application is running! "; 
    }
}
