package com.ohgiraffers.practicespringdatajpa.Main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainController {
    @GetMapping(value = {"/", "main"})
    public String toMain() {
        return "/main";
    }
}
