package hello.core.member;

public class MemberServiceImpl implements MemberService {

//     MemoryMemberRepository가 인터페이스가 아닌, 구현체에 의존하고 있음
//    private final MemberRepository memberRepository = new 어쩌고();

    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memoryMemberRepository) {
        this.memberRepository = memoryMemberRepository;
    }

    @Override
    public void join(Member member){
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId){
        return memberRepository.findById(memberId);
    }

}
