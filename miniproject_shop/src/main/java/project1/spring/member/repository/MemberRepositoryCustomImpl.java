package project1.spring.member.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.thymeleaf.util.StringUtils;

import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.core.types.dsl.Wildcard;
import com.querydsl.jpa.impl.JPAQueryFactory;

import project1.spring.member.dto.MemberDto;
import project1.spring.member.entity.Member;
import project1.spring.member.entity.QMember;

public class MemberRepositoryCustomImpl implements MemberRepositoryCustom{

	// querydsl 사용하기 위한 준비
	private JPAQueryFactory queryFactory;
	
	// 생성자 만들기
	// query를 던질 준비 완료
	public MemberRepositoryCustomImpl(EntityManager em) {
		queryFactory = new JPAQueryFactory(em);
	}
	
	
	
	
	@Override
	public Page<Member> getAdminMemberPage(MemberDto memberDto, Pageable pageable) {

		List<Member> content = queryFactory.selectFrom(QMember.member)
				.where(searchByLike(memberDto.getSearchBy(), memberDto.getSearchQuery()))
				//정렬과 페이지 시작할 위치.
				.orderBy(QMember.member.id.asc())
				.offset(pageable.getOffset())
				.limit(pageable.getPageSize())
				.fetch();
				
		long total = queryFactory.select(Wildcard.count).from(QMember.member)
								 .where(searchByLike(memberDto.getSearchBy(), memberDto.getSearchQuery()))
								 .fetchOne();
				
		return new PageImpl<>(content, pageable, total);
	}


	// 쿼리 dsl의 메소드
	private BooleanExpression searchByLike(String searchBy, String searchQuery) {
		
		//이름으로 검색
		if(StringUtils.equals("name", searchBy)) {
			return QMember.member.name.like("%" + searchQuery + "%");
		//이메일로 검색
		} else if(StringUtils.equals("email", searchBy)) {
			return QMember.member.email.like("%" + searchQuery + "%");
		//주소로 검색
		} else if(StringUtils.equals("address", searchBy)){
			return QMember.member.address.like("%" + searchQuery + "%");
		}
		
		return null;
	}


	
	
	
	
	
}
