package hello.hellospring;

import hello.hellospring.repository.MemberRepository;
import hello.hellospring.service.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
class HelloSpringApplicationTests {

	@Test
	void contextLoads() {
	}

    @SpringBootTest
    @Transactional
    static
    class MemberServiceIntegrationTest {
        @Autowired
        MemberService memberService;
        @Autowired
        MemberRepository memberRepository;
        @Test
        public void 회원가입() throws Exception {
        }
