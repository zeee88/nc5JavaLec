package Homework_0405;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class stream4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		char [] input = sc.nextLine().toCharArray();
		
		List<Character> charList = new ArrayList <Character>();
		
		for(int i = 0; i < input.length; i++) {
			charList.add(input[i]);
		}
		
		
		
		Stream <Character> chStream = charList.stream();
		Stream <Character> mapStream = chStream.map(m -> {
										Character.toUpperCase() ? m.tolowerCase(m) :  m.toUpperCase(m) ;
														return m;		
														});
		mapStream.forEach(m -> System.out.println(m));
		
		//forEach는 return값 없기 때문에 Stream <Character> 없이 바로 사용.
		

		
		
		
	}

}
