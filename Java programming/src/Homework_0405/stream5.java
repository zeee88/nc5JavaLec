package Homework_0405;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class stream5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		List <String> strList = new ArrayList <String>();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("문자열 하나를 입력하세요");
			String input = sc.nextLine();
			strList.add(input);
		}
		
		sc.close();
		
		
		Stream <String> strStream = strList.stream();
		
		Stream <String> filStream = strStream.filter(a -> a.matches(".*[a-zA-Z].*"));		//챕터16 정규표현식
		filStream.forEach(a -> System.out.println(a));
	}

}
