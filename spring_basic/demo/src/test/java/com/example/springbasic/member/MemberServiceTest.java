//package com.example.springbasic.member;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//public class MemberServiceTest {
//
//    MemberService memberService = new MemberServiceImp1();
//
//    @Test
//    void join() {
//        Member member= new Member(1L, "memberA", Grade.VIP);
//
//        memberService.join(member);
//        Member findMember = memberService.findMember(1L);
//
//        Assertions.assertTrue(member.equals(findMember));
//    }
//}
