package com.xiaohei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    // 0w0
    @RequestMapping(value = {"","/"})
    public String home(){

        return "index";

    }

}
