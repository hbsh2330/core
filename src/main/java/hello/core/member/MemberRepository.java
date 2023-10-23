package hello.core.member;
// 회원 저장소 1. 회원저장 2. 회원 조회
public interface MemberRepository {
    void save(Member member);

    Member findById(Long memberId);
}
