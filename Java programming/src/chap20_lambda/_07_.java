package chap20_lambda;

import chap20_lambda.clazz.CompareStr;

public class _07_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		action(String :: equals);	 //equals가 밑의 action에서 작동해서 두 문자를 비교해 줌
									 //매개변수의 메소드 참조
		
//		<이 방법을 위와 같이 표현 가능>
//		action((a, b) -> {
//			boolean result = a.equals(b);
//			return result;
//		});
		
	}

	
	public static void action(CompareStr ct) {
		boolean result = ct.compareTwoStr("naver", "never");
		System.out.println(result);
		
	}
}
