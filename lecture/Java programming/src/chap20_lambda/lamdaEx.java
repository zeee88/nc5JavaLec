package chap20_lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import chap20_lambda.clazz.UserCharString;

public class lamdaEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		List<UserCharString> cusList = new ArrayList <UserCharString>();
		
		for(int i = 0; i < 3; i++) {
		System.out.println("문자를 입력하세요");
		cusList.add(new UserCharString(sc.nextLine()));
		}
		
		System.out.println("찾을 문자를 입력하세요");
		char findCh = sc.next().charAt(0);
					//sc.next().toCharArray()[0]
		
		sc.close();
		
		
		
		//사용자가 입력한 ch가 없으면 "", 있으면 문자열 그대로 str에 저장
		
		//for(타입, 변수이름 : 순회할 배열이나 컬렉션 객체)
		for(UserCharString u : cusList) {
			u.changeStr(findCh, (c, s) ->{				//changeStr메소드에 있는 ch(findCh)를 찾고 UserChar(c, s)참조 
				String returnStr = "";
				for(int i = 0; i < s.length(); i++) {
					if(s.charAt(i) == c) {
						returnStr = s;
					}
				}
				return returnStr;		  //전체 {} 안에서 return값 하나
				
			});
		}
			System.out.println(cusList);
		
		
		
		
		
	}

}
