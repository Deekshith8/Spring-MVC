package com.Spring.demoSecurity.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/showLoginPage")
    public String showmyloginpage(){

        return "fancy-login";
    }

    //add request mapping for access denied

    @GetMapping("/access-denied")
    public String accessdenied(){

        return "access-denied";
    }
}
