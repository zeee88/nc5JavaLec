package project1.spring.member.dto;

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
public class MemberFormDto {

	@NotBlank(message="이름은 필수 항목 입니다.")
	private String name;
	
	@NotEmpty(message="이메일은 필수 항목 입니다.")
	@Email(message="이메일 형식으로 입력하세요.")
	private String email; 
	
	@NotEmpty(message="비밀번호는 필수 항목 입니다.")
	@Length(min = 4, max=12, message="최소 4자, 최대 12자를 입력하세요.")
	private String password;
	
	@NotEmpty(message="주소는 필수항목 입니다.")
	private String address;
	
}

//@NotBlank와 @NotEmpty는 비슷하지만 @NotBlank가 가장 강도가 강한 조건. 
//@NotBlank은 null, "", " " 모두 허용x
//@NotEmpty은 null, "" 허용x,  " "은 허용o