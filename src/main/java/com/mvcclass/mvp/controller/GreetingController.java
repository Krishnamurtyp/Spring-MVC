package com.mvcclass.mvp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class GreetingController {

    @GetMapping("greeting")
    public String Greeting(Map<String,Object> model){

        model.put("message","The Universe is huge!");

        return "greeting";
    }
}
