package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by trina on 9/28/2016.
 */

@RestController
public class HomeController {

    @RequestMapping("/")
    public String hello(){
        return "hello";
    }

}
