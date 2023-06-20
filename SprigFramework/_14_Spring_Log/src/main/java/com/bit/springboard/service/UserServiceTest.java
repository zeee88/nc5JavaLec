package com.bit.springboard.service;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.bit.springboard.dto.UserDTO;

public class UserServiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("root-context.xml");
		
		UserService userService = 
				
				(UserService)factory.getBean("userService");
		
		
		//user 등록
		UserDTO userDTO = new UserDTO();
		
		userDTO.setUserId("bit");
		userDTO.setUserPw("1234");
		userDTO.setUserName("naver");
		userDTO.setUserEmail("123@naver.com");
		userDTO.setUserTel("0000");
		
//		userService.join(userDTO);
		
		
		//user 조회
		UserDTO userDTO2 = userService.getUser(1);
		System.out.println(userDTO2);
		
		
		
		
		factory.close();
		
		
		
	}
}
