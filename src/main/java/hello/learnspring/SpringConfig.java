package hello.learnspring;

import hello.learnspring.repository.MemberRepository;
import hello.learnspring.repository.MemoryMemberRepository;
import hello.learnspring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
}
