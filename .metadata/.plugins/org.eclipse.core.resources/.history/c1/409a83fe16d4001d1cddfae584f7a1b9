package Homework_0405;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class stream5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List <String> strList = new ArrayList <String>();
		
		
		strList.add("안녕하세요");
		strList.add("집에가고싶어");
		strList.add("오늘은비오니까");
		strList.add("Hello안녕");
		strList.add("bit캠프");
		
		
		Stream <String> strStream = strList.stream();
		
		Stream <String> filStream = strStream.filter(a -> a.matches(".*[a-zA-Z].*"));		//챕터16 정규표현식
		filStream.forEach(a -> System.out.println(a));
	}

}
