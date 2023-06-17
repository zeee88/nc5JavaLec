package com.admin_page.admin.user.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.security.crypto.password.PasswordEncoder;

import com.admin_page.admin.user.constant.Role;
import com.admin_page.admin.user.dto.UserFormDto;
import com.admin_page.admin.utils.entity.BaseTimeEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseTimeEntity{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	
	@Column(unique = true, length = 50)
	private String userName;
	
	private String userPw;
	
	@Column(unique = true, length = 100)
	private String userEmail;
	
	@Column(nullable = false)
	private String userTel;
	
	private String provider;
	
	private Long providerId;
	
	//BaseTimeEntity로 따로 추상클래스 생성
//	//가입날짜
//	@Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
//	private LocalDateTime createdAt;
//	
//	//정보수정날짜
//	@Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
//	private LocalDateTime updatedAt;
	
	@Enumerated(EnumType.STRING)
	private Role role;
	
	private String userAddress1;
	
	private String userAddress2;
	
	private String userAddress3;

	public static User createUser(UserFormDto userFormDto, PasswordEncoder passwordEncoder) {
		User user = new User();
		user.setUserName(userFormDto.getUserName());
		user.setUserEmail(userFormDto.getUserEmail());
		user.setUserTel(userFormDto.getUserTel());
		user.setRole(Role.USER);
		
		//암호화된 형태로 password 세팅
		String password = passwordEncoder.encode(userFormDto.getUserPw());
		user.setUserPw(password);
		
		return user;
		
	}
	
}
