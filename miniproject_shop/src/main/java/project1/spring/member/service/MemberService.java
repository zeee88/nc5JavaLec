package project1.spring.member.service;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import project1.spring.member.dto.MemberDto;
import project1.spring.member.entity.Member;
import project1.spring.member.repository.MemberRepository;

//@Controller는 핸들러가 스캔할 수 있는 Bean 객체가 되어 서블릿용 컨테이너에 생성된다.
//@Repository, @Service도 해당 클래스를 루트 컨테이너에 Bean 객체로 생성해주는 어노테이션.
//Bean 객체는 항상 데이터 변경이 없는 객체에 한해 사용.
//@Controller: 프레젠테이션 레이어, 웹 요청과 응답을 처리
//@Service: 로직 처리. 서비스 레이어, 내부에서 자바 로직을 처리
//@Repository: 외부 I/O 처리. DB나 파일같은 외부 I/O 작업을 처리.
//@Transactional: 메서드가 포함하고 있는 작업 중에 하나라도 실패할 경우 전체 작업을 취소한다.

@Service
@Transactional
@Log4j2
@RequiredArgsConstructor		//Autowired와 같은 기능. 객체 생성 없이 자동으로 메모리에 올려주는 기능.
public class MemberService implements UserDetailsService{
	
	private final MemberRepository memberRepository;
	
	public Member saveMember(Member member) {
		validateDuplicate(member);
		return memberRepository.save(member);
	}

	//중복 등록 시도 방지
	private void validateDuplicate(Member member) {

		Member findMember = memberRepository.findByEmail(member.getEmail());
		if(findMember != null) {
			throw new IllegalStateException("이미 등록된 사용자 입니다.");
		}
	}

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

		//찾으면 데이터 가져오고, 없으면 예외 처리
		Member member = memberRepository.findByEmail(email);
		
		if(member == null) {
			throw new UsernameNotFoundException("해당 사용자가 없습니다." + email);
		}
		
		log.info("============================> loadUserByUsername : " + member);
		
		return User.builder()
				.username(member.getEmail())
				.password(member.getPassword())
				.roles(member.getRole().toString())
				.build();
	}
	
	//memberRepositoryCustom, memberRepositoryCustomImpl에서 작성한 쿼리문 출력하기
	public Page<Member> getAdminMemberPage(MemberDto memberDto, Pageable pageable){
		return memberRepository.getAdminMemberPage(memberDto, pageable);
	}

}
