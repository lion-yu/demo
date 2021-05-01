package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/hello")
@ResponseBody
public class HelloController {
    @RequestMapping("/first")
    public Map<String, String> hello() {
        Map<String, String> result = new HashMap<>(2);
        result.put("name", "mingyu");
        result.put("age", "35");
        return result;
    }
}
