package Homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class _0327_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1. 정수형 데이터를 저장할 수 있는 ArrayList를 생성하고 
//		   사용자가 입력한 5개의 정수를 저장하고 출력하세요.
		
		//파생된 ArrayList는 뒤에 
//		List<Integer> list = new ArrayList<Integer>();  //가변적인 배열을 생성하는 것이기 때문에 길이 지정 안됨.
//													//<Integer>(3)  => 오류
//		Scanner sc = new Scanner(System.in);
//		System.out.println("5개의 정수를 입력하세요");
//		
//		for(int i = 0; i < 5; i++) {
//			int input = sc.nextInt();				//=> 두 문장 한 문장으로 가능
//		}											//list.add(sc.nextInt());
//		list.add(input);
//	
//		System.out.println(list);
		
		
//		2. 정수형 데이터를 저장할 수 있는 LinkedList를 생성하고 
//		   사용자가 입력한 5개의 정수를 저장하고
//		   index가 3, 4번 요소를 값은 100, 200으로 변경하고 출력하세요.

//		LinkedList<Integer> list = new LinkedList<Integer>();
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("5개의 정수를 입력하세요");
//		
//		for(int i = 0; i < 5; i++) {
//			int input = sc.nextInt();
//			list.add(input);
//		}
//		System.out.println("변경 전 LinkedList" + list);
//		list.set(3, 100);       //set(인덱스 번호, 변경할 값)
//		list.set(4, 200);
		
//		
//		System.out.println(list);
		
		
//		3. Map<String, Integer>을 하나 생성하여 key는 알파벳(대소문자 구분) 
//		   value는 해당 알파벳의 유니코드 값을 Integer형태로 저장하세요.
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i = 65; i <= 90; i++) {
			map.put(Character.toString(i), i);   //character.toString : 문자를 문자열로 변환하여 출력
		}										//String.valueOf((char)i)로도 작성 가능
		
		for(int i = 97; i <= 122; i++) {
			map.put(Character.toString(i), i);
		}
		
		System.out.print(map);
		
		
		
		
		
		
		
	}


}
