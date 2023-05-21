package com.james.train.member.controller;

import com.james.train.member.service.MemberService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Resource
    private MemberService memberService;

    @GetMapping("/hello")
    public void hello() {
        System.out.println("hello world");
        return ;
    }
}
