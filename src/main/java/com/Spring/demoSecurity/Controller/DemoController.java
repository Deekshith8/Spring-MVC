package com.Spring.demoSecurity.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/")
    public String showHome(){
        return "home";
    }



    // add  request mapping do /leaders

    @GetMapping("/leaders")
    public String showleaders(){
        return "leaders";
    }

  // add request mapping fro /systems
  @GetMapping("/systems")
  public String showsystems(){
      System.out.println("HIIIIII......");
      return "systems";
  }


}
