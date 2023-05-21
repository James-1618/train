package com.james.train.member.controller;

import com.james.train.member.service.MemberService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Resource
    private MemberService memberService;
    @GetMapping("/hello")
    public String hello(String[] args) {
        return new String("hello world!");
    }
    @PostMapping("/register")
    public long register(String mobile){
        return memberService.register(mobile);
    }
}
