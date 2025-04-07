package hello.core.member;

public interface MemberService {
    // 저장
    void join(Member member);
    // 찾기
    Member findMember(Long memberId);
}
