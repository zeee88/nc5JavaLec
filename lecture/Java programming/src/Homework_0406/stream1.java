package Homework_0406;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class stream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1. 사용자가 입력한 문자열 10개를 저장한 문자열 리스트를 이용하여 
//		문자열의 길이가 5이상인 문자열만 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		List <String> strList =  new ArrayList <String>();
		
		for(int i = 0; i < 10; i++) {
			System.out.println("문자열을 입력해주세요");
			strList.add(sc.nextLine());
		}
		
		sc.close();
		
		Stream <String> strStream = strList.stream();
		
		strStream.filter(a -> a.length() >= 5)
				.forEach(a -> System.out.println(a));
		
		
	}

}
