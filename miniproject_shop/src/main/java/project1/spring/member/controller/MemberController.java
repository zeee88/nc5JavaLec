package project1.spring.member.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j2;
import project1.spring.member.dto.MemberFormDto;
import project1.spring.member.entity.Member;
import project1.spring.member.service.MemberService;

@Controller
@Log4j2
@RequestMapping("/member")
public class MemberController {

	@Autowired
	MemberService memberService;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@GetMapping("/login")
	public String login() {
		return "member/memberLogin";
	}
	
	
	//Model 객체에 "memberFormDto"라는 이름으로 MemberFormDto 객체를 추가.
	//이 객체는 "member/memberForm" 뷰에서 사용될 데이터를 담고 있다.
	
	//Model model 매개변수는 Spring MVC에서 제공하는 Model 객체.
	//Model 객체를 사용하여 데이터를 뷰로 전달할 수 있다.
	@GetMapping("/new")
	public String memberForm(Model model) {
		model.addAttribute("memberFormDto", new MemberFormDto());
		return "member/memberForm";
	}
	
	@PostMapping("/new")
	public String memberForm(@Valid MemberFormDto memberFormDto,		//valid로 결과 값 검증.
			BindingResult bindingResult, Model model) {		//바인딩에 문제가 있는지없는지, 에러에 대한 결과 받아옴. 
		
		if(bindingResult.hasErrors()) {
			return "member/memberForm";
		}
		
		try {
			//MemberFormDto 객체와 passwordEncoder를 이용하여 Member 객체를 생성하고, 이를 memberService를 통해 저장
			//회원 정보를 영구 저장소에 저장하기 위해 사용
			Member member = Member.createMember(memberFormDto, passwordEncoder);
			memberService.saveMember(member);
		}catch(IllegalStateException e) {
			model.addAttribute("errorMessage", e.getMessage());
			return "member/memberForm";
		}
		
		return "redirect:/"; 
	}
	
	@GetMapping("/login/error")
	public String loginError(Model model) {
		model.addAttribute("loginErrorMsg", "아이디 또는 패스워드가 잘못되었습니다.");
		return "member/memberLogin";
	}
	
}
