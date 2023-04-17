package chap17_generic;

import java.util.ArrayList;
import java.util.List;

public class _04_genetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> intList = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			intList.add(i+1);
		}
		
		System.out.println(_04_genetic.<Integer>getEven(intList));
		//위의 코드와 같음.<Integer>없어도 됨. System.out.println(_04_genetic.getEven(intList));
		
		//Number상속 받는 T
		//리턴타입 List<T> getEven(List<T> list)
		
		
	}
				  //Number을 상속받는 T	    //리턴 타입  //이름(매개변수)
	public static <T extends Number>    List<T>   getEven(List<T> list){
		
		List<T> returnList = new ArrayList<T>();
		
		//t형태로 담아서 list하나씩 꺼내기
		for(T t : list) {
			if(t.intValue() % 2 ==0) {
				returnList.add(t);
			}
		}
		return returnList;
	}

}
