package com.admin_page.admin.user.dto;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserFormDto {
	
	//뷰에서 표시되는 부분이므로 dto에서 설정
	@NotBlank(message="이름은 필수 항목 입니다.")
	private String userName;
	
	@NotEmpty(message="비밀번호는 필수 항목 입니다.")
	@Length(min = 4, max=12, message="최소 4자, 최대 12자를 입력하세요.")
	private String userPw;
	
	@NotEmpty(message="이메일은 필수 항목 입니다.")
	@Email(message="이메일 형식으로 입력하세요.")
	private String userEmail;
	
	@NotEmpty(message = "전화번호는 필수 항목 입니다.")
	private String userTel;
	
	private String userAddress1;
	
	private String userAddress2;
	
	private String userAddress3;

}
