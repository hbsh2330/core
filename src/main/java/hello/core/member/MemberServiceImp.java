package hello.core.member;

public class MemberServiceImp implements MemberService{

    private final MemberRepository memberRepository;

    public MemberServiceImp(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }
// 2. 회원조회 로직 memberId 입력시 memberRepository에 있는 findByid 메서드 호출
    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
