package project1.spring.member.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MemberDto {

//	private String name;
//	
//	private String email; 
//	
//	private String address;
	
	private String searchBy;
	
	private String searchQuery = "";
}
