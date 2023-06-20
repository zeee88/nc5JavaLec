package project1.spring.member.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import project1.spring.member.dto.MemberDto;
import project1.spring.member.entity.Member;

public interface MemberRepositoryCustom {

		//데이터가 많아지면 다 가져올 수 없으니 Page<>를 사용
		//Pageable은 몇 번째 페이지부터 몇 개 들고 올건지 설정하는 인터페이스
		Page<Member> getAdminMemberPage(MemberDto memberDto, Pageable pageable);
}
