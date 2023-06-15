package project1.spring.config;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

//설계한 엔티티들 보면 등록시간, 수정시간 등 멤버변수가 공통으로 들어가있음. 
//공통 멤버 변수들을 추상 클래스로 만들고, 해당 추상 클래스를 상속받는 형태로 만듦.
public class AuditorAwareImpl implements AuditorAware<String> {

	//Optional<T>는 NPE(NullPointerException)를 방지할 수 있게 도와준다.
	@Override
	public Optional<String> getCurrentAuditor() {
		
		//인증 정보 가져오기
		Authentication authentication =
				SecurityContextHolder.getContext().getAuthentication();
		String userId = "";
		
		//인증되면 정보 가져온다
		if(authentication != null) {
			userId = authentication.getName();
		}
		
		return Optional.of(userId);
	}

}
