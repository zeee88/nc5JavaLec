package Homework_0404_use;

import Homework_0404.combineStrBuilder;
import Homework_0404.reverse;

public class _02_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		2. 두 개의 StringBuilder 값을 매개변수로 받아 두 개의 값을 합친 후 역순으로 바꿔서 리턴하는 
//		combineStrBuilder를 람다식으로 구현하세요.

//		3. 2번 문제에서 두 개를 합치는 메소드 appendSb와 역순으로 변경하는 메소드 reverseSb를 각각 선언하고 
//		StringBuilder의 메소드를 참조하여 각각 구현하세요.
		
		
		
		action((a , b) -> {
			StringBuilder stb = a.append(b).reverse();		//문자열 붙이고 뒤집기
			return stb;
		});
		

	
		appendSb((a, b)-> {
			StringBuilder stb2 = a.append(b);			//문자열 붙이기
			return stb2;
		});
	
		
		reversesb(a -> {
			StringBuilder stb3 = a.reverse();		//문자열 뒤집기
			return stb3;
		});
		
		
	}
	
	
	
	public static void action(combineStrBuilder cb) {
		//cb.combineStr(a, b)형식. a랑 b를  new StringBuilder()로 바로 받거나
		//StringBuilder stb = new StringBuilder(a); 로 만들기

//		StringBuilder a = new StringBuilder("안녕");
//		StringBuilder b = new StringBuilder("하세요");
//		System.out.println(cb.combineStr(a, b));
//		이 세 줄을 한번에 표현하는 방법은 밑 두 줄 처럼
		
		StringBuilder stb = cb.combineStr(new StringBuilder ("안녕"), new StringBuilder("하세요"));
		System.out.println(stb);
	}
	
	
	public static void appendSb(combineStrBuilder cb) {
		
		StringBuilder stb2 = cb.combineStr(new StringBuilder("지금"), new StringBuilder("비온다"));
		System.out.println(stb2);
		
		
	}
	
	public static void reversesb(reverse rstb) {
		
		StringBuilder stb3 = rstb.reversestb(new StringBuilder("집에가고싶어"));
		System.out.println(stb3);
		
		//StringBuilder에 매개변수 하나만 만들어서 뒤집기
		//reverse는 두 개의 StringBuilder를 붙여서 뒤집기는 안됨 
		
		
	}
	
	
	
	
	
}
