package com.example.springbasic.member;

public class MemberServiceImp1 implements  MemberService {

    private final MemberRepository memberRepository;

    public MemberServiceImp1(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public void join(Member member) {
        memberRepository.save(member);
    }

    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
