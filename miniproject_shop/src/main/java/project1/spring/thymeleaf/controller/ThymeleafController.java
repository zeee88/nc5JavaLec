package project1.spring.thymeleaf.controller;

import java.awt.Point;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j2;
import project1.spring.item.dto.ItemDto;

@Controller
@Log4j2		
//로그: 소프트웨어가 가동되면 일련의 이벤트들을 일으키는데, 이런 이벤트들의 성공여부/실패여부/어떤 이벤트가 어떻게 일어났는지 등 모든 작업행위
//로깅: 로그를 남기는 행위.
//@Log4j2: java로 만들어진 프로그램의 로깅을 도와주는 라이브러리 log.info(); 형태로 사용
@RequestMapping(value = "/thymeleaf")
public class ThymeleafController {

	@GetMapping(value = "/ex1")
	public String ex1(Model model) {		//model 객체를 매개변수로 받음
		Point p = new Point(10, 20);
		model.addAttribute("data", p);
		
//		model.addAttribute("data","SpringBoot Study");
		return "thymeleaf/ex1";		//"thymeleaf/ex1"라는 문자열을 반환.
	}
	
	
	
	@GetMapping(value = "/ex2")
	public String ex2(Model model) {
		
		ItemDto itemDto = new ItemDto();
		itemDto.setItemDetail("상품 상세 설명");
		itemDto.setItemNm("테스트 상품 1");
		itemDto.setPrice(10000);
		itemDto.setRegTime(LocalDateTime.now());
		
		model.addAttribute("itemDto", itemDto);
		
		return "thymeleaf/ex2";
	}
	
	
	
	@GetMapping(value = {"/ex3", "/ex4"})
	public void ex3(Model model) {
		
		List<ItemDto> list = new ArrayList<>();
		
		for (int i = 1; i <= 10; i++) {
			ItemDto itemDto = new ItemDto();
			itemDto.setItemDetail("상품 상세 설명" + i);
			itemDto.setItemNm("테스트 상품 " + i);
			itemDto.setPrice(10000 * i);
			itemDto.setRegTime(LocalDateTime.now());
			list.add(itemDto);
		}
		   
		model.addAttribute("list", list);
		
	}
	
	
	//param은 http요청을 통해 클라이언트에서 서버로 데이터를 전송하는 방법.
	//주로 사용자의 입력이나 요청에 필요한 정보를 담고 있다.
	//이렇게 전달된 파라미터는 서버에서 비즈니스 로직 수행, 데이터 검증, 데이터베이스 조회 등 다양한 용도로 사용될 수 있다.
	//예를 들어 사용자의 회원가입 요청에서 전달된 파라미터는 회원 정보를 생성하고 데이터베이스에 저장하는데 사용될 수 있다.
	@GetMapping(value = "/ex5")
	public String ex5(String param1, String param2, Model model) {
		log.info("=======" + param1 + ", " + param2);
		
		model.addAttribute("param1", param1);
		model.addAttribute("param2", param2);
		
		return "thymeleaf/ex5";
	}
	
	
	@GetMapping(value = {"/ex6", "/ex7"})
	public void ex6() {
		
	}
	
}
