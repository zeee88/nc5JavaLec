package com.admin_page.admin.user.service;

import java.util.Optional;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.admin_page.admin.user.repository.UserRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
//Transactional: 메서드가 포함하고 있는 작업 중에 하나라도 실패할 경우 전체 작업을 취소한다.
@Transactional
@Log4j2
//Autowired와 같은 기능. 객체 생성 없이 자동으로 메모리에 올려주는 기능.
@RequiredArgsConstructor
public class UserService implements UserDetailsService{

	private final UserRepository userRepository;
	
	//중복 등록 시도 방지
	private void validateDuplicate(User user) {
		
		Optional<User> findUser = userRepository.findById(user.getuserId());
		if(findUser != null) {
			throw new IllegalStateException("이미 등록된 사용자입니다.");
		}
	}
	
	//중복 등록 확인 후 db에 저장
	public User saveUser(User user) {
		validateDuplicate(user);
		return userRepository.save(user);
		
	}
	
	
	

}
