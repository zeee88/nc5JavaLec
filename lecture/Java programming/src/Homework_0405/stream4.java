package Homework_0405;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class stream4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		List<Character> charList = new ArrayList <Character>();
		
		for(int i = 0; i < 10; i++) {
			System.out.println("영문자 하나를 입력하세요");
			charList.add(sc.next().charAt(0));		//입력값을 저장하고 char형태로 받기
		}
		sc.close();
		
		
		charList.stream().map(ch -> //Character타입의 대문자니?		//소문자로 바꿔					//대문자로 바꿔
							Character.isUpperCase(ch) ? Character.toLowerCase(ch) :  Character.toUpperCase(ch))
							.forEach(ch -> System.out.println(ch));
		
		
		
		
		//forEach는 void형태로 return값 없기 때문에 Stream<...> 없이 바로 사용해야 함.

		
		
		
		
		
		
		
	}

}
