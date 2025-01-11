//package com.example.springbasic.order;
//
//import com.example.springbasic.member.*;
//import org.assertj.core.api.Assertions;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import org.junit.jupiter.api.Test;
//
//public class OrderServiceTest {
//
//    MemberService memberService = new MemberServiceImp1();
//    OrderService orderService = new OrderServiceImp1();
//
//    @Test
//    void createOrder() {
//        long memberId = 1L;
//        Member member = new Member(memberId, "memberA", Grade.VIP);
//        memberService.join(member);
//
//        Order order = orderService.createOrder(memberId, "itemA", 10000);
//        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
//    }
//}
