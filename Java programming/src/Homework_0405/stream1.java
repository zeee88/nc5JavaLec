package Homework_0405;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class stream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <Integer> intList = new ArrayList <Integer>();
		
		for(int i = 0; i < 10; i++) {
			
			intList.add((int)(Math.random() * 10 + 1));
			
		}
		System.out.println(intList);
		
		
		
		Stream <Integer> intStream = intList.stream(); 
		
		Stream <Integer> mapString = intStream.map(i -> i * 3);
		mapString.forEach(i -> System.out.println(i));
		
	}

}
