package project1.spring.member.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import project1.spring.member.entity.Member;

//JpaRepository<Entity 클래스, PK 타입>
public interface MemberRepository extends JpaRepository<Member,Long>
			, MemberRepositoryCustom{

	Member findByEmail(String email);
	
	
}
          