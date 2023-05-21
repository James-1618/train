package com.james.train.member.controller;

import com.james.train.common.resp.CommonResp;
import com.james.train.member.req.MemberRegisterReq;
import com.james.train.member.req.MemberSendCodeReq;
import com.james.train.member.service.MemberService;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
    @Resource
    private MemberService memberService;

    @PostMapping("/register")
    public CommonResp<Long> register(@Valid MemberRegisterReq req) {
        long register = memberService.register(req);
        return new CommonResp<>(register);
    }
    @PostMapping("/send-code")
    public CommonResp<Long> sendCode(@Valid MemberSendCodeReq req) {
        memberService.sendCode(req);
        return new CommonResp<>();
    }

//    @PostMapping("/login")
//    public CommonResp<MemberLoginResp> login(@Valid @RequestBody MemberLoginReq req) {
//        MemberLoginResp resp = memberService.login(req);
//        return new CommonResp<>(resp);
//    }
}
