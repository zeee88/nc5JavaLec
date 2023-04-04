package Homework_0404_use;

import Homework_0404.combineStrBuilder;
import Homework_0404.reverse;

public class _02_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		action((a , b) -> {
			StringBuilder str = a.append(b).reverse();		//문자열 붙이고 뒤집기
			return str;
		});
		

	
		appendSb((a, b)-> {
			StringBuilder str2 = a.append(b);
			return str2;
		});
	
		
		reversesb(a -> {
			StringBuilder str3 = a.reverse();
			return str3;
		});
		
		
	}
	
	
	
	public static void action(combineStrBuilder cb) {
		//cb.combineStr(a, b)형식. a랑 b를  new StringBuilder()로 바로 받거나
		//StringBuilder stb = new StringBuilder(a); 로 만들기

//		StringBuilder a = new StringBuilder("안녕");
//		StringBuilder b = new StringBuilder("하세요");
//		StringBuilder stb = cb.combineStr(a, b);
//		이 세줄을 한번에 표현하는 방법은 밑 줄
		
		StringBuilder stb = cb.combineStr(new StringBuilder("안녕"), new StringBuilder("하세요"));
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
