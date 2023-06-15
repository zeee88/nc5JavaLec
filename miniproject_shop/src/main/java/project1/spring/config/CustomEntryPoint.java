package project1.spring.config;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

public class CustomEntryPoint implements AuthenticationEntryPoint {

	
	//HttpServletRequest request: 클라이언트의 요청 정보를 담고 있는 객체
	//HttpServletResponse response: 서버에서 클라이언트로 응답을 보내기 위한 객체
	//AuthenticationException authException: 인증 과정에서 발생한 예외를 나타내는 객체
	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException authException) throws IOException, ServletException {
		//인증되지 않은 사용자가 접근하면 "Unauthorized"라는 메시지가 나옴
		response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized");
	}

}
