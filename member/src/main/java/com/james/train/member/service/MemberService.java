package com.james.train.member.service;

import cn.hutool.core.collection.CollUtil;
import com.james.train.member.domain.Member;
import com.james.train.member.domain.MemberExample;
import com.james.train.member.mapper.MemberMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    @Resource
    private MemberMapper memberMapper;

    public long register(String mobile){
        MemberExample memberExample = new MemberExample();
        memberExample.createCriteria().andMobileEqualTo(mobile);
        Member member1 = memberMapper.selectByPrimaryKey(123132L);
        List<Member> list = memberMapper.selectByExample(memberExample);
        if(CollUtil.isNotEmpty(list)){
            throw new RuntimeException("手机号码已注册");
        }
        Member member = new Member();
        member.setMobile(mobile);
        member.setId(System.currentTimeMillis());
        memberMapper.insert(member);
        return member.getId();
    }

}
