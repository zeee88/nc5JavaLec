package project1.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;


@Configuration		//설정파일을 만들기 위한 어노테이션 or Bean을 등록하기 위한 어노테이션. Bean을 등록할 때 싱글톤(하나의 인스턴스만 생성)이 되도록 보장.
@EnableWebSecurity	//EnableWebSecurity 어노테이션을 달면 SpringSecurityFilterChain이 자동으로 포함됨.


public class SecurityConfig {
	
	 @Bean
	    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		
		 http.formLogin()
		 	 .loginPage("/member/login")
		 	 .defaultSuccessUrl("/")
		 	 .usernameParameter("email")
		 	 .failureUrl("/member/login/error")
		 	 .and()
		 	 .logout()
		 	 .logoutRequestMatcher(new AntPathRequestMatcher("/member/logout"))
		 	 .logoutSuccessUrl("/");
		 
		 http.authorizeRequests()
		 	 .mvcMatchers("/css/**", "/js/**").permitAll()		//mvcMatchers: 특정 경로를 지정해서 권한 설정.
		 	 .mvcMatchers("/", "/member/**", "/item/**").permitAll()
		 	 .mvcMatchers("/admin/**").hasRole("ADMIN")
		 	 .anyRequest().authenticated();		//어떤 요청이든지 인증되어야 한다.
		 
		 http.exceptionHandling()
		 	 .authenticationEntryPoint(new CustomEntryPoint());
		 	 
		 	 
		 return http.build();
		 
	 }
	 
	 @Bean
	 public PasswordEncoder passwordEncoder() {
		//스프링 시큐리티(Spring Seurity) 프레임워크에서 제공하는 클래스 중 하나로 
		//비밀번호를 암호화하는 데 사용할 수 있는 메서드를 가진 클래스.
		 return new BCryptPasswordEncoder();		
		 
	 }

}
