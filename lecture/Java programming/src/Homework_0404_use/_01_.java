package Homework_0404_use;

import Homework_0404.printEvenNum;

public class _01_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1. 매개변수로 받아온 정수배열에서 짝수만 찾아서 출력하는 printEvenNum을 람다식으로 구현하세요.
		
		
//		action(printEvenNum :: evenNum);  //클래스명 :: 메소드명 일 때만. 이 문제에서는 클래스를 참조한 것이 아니라 인터페이스여서 안됨.
		action(arr -> {
		});
		
	}

	
	public static void action(printEvenNum en) {

		//방법 2. 랜덤으로 배열 10개 생성하기
		int[] arr = new int[10];
		for(int i = 0; i < 10; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}
		
		
		//방법 1. 이렇게 하면 main에서 실행문 없이 람다식 작성 action (arr -> { });
//		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] % 2 == 0) {
//				System.out.println(arr[i]);
//
//			}
//
//		}
		
		
		
		
		
		
	}

}

