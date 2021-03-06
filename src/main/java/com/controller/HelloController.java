package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(HttpServletRequest request,
                        @RequestParam(value = "name", required = false, defaultValue = "albertXe") String name){
        request.setAttribute("name",name);
        return "hello";
    }

    @RequestMapping("/index")
    public String index(HttpServletRequest request,
                        @RequestParam(value = "name", required = false, defaultValue = "albertXe") String name){
        request.setAttribute("name",name);
        return "index";
    }

    @RequestMapping("/index1")
    public String index1(HttpServletRequest request,
                        @RequestParam(value = "name", required = false, defaultValue = "albertXe") String name){
        request.setAttribute("name",name);
        return "index";
    }

}
