package com.LDH.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/members")
@Controller
@RequiredArgsConstructor
public class MemberController {

    @GetMapping(value="/new")
    public String test(){return "Sample/index";}

    @GetMapping(value="/new2")
    public String test2(){return "Sample/login";}

}
