package Homework_0328;

import java.util.ArrayList;
import java.util.List;
	
	//1. 멤버변수로 private T t를 가지면서 getT(), setT() 메소드를 갖는 
	//제네릭클래스 GenericCla를 생성하세요.
	public class GenericCla<T> {

	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	//2 .public static <T> String add(T t1, T t2) 제네릭 메소드를 정의하고
	//매개변수로 어떤 값이 들어오던 문자열 결합연산이 돼서 스트링값으로 리턴하도록 만드세요.
	public static <T> String add(T t1, T t2) {
		
		return "" + t1 + t2;     //String 붙이기 concat  //StringBuffer 붙이기 append
	}
	
	
	//3. public static Integer add(List<?> list)
	//와일드 카드를 이용한 list를 다 더하는 메소드를 구현하세요.
	public static Integer add(List<?> list) {
		int sum = 0;
		
		for(Object obj : list) {
			if(obj instanceof Integer || obj instanceof Long) {
				sum += (int)obj;
			}else if(obj instanceof Double || obj instanceof Float) {
				sum += ((Double) obj).intValue();
			}else if(obj instanceof String) {
				sum += Integer.parseInt((String)obj);
			}else {
				sum += Integer.parseInt(obj.toString());
			}
		}
		return sum;
	}
	
	//4. 어떤 배열이던지 받아서 인덱스가 3의 배수인 요소만 출력하는 
	//메소드 void printArr을 구현하세요.
	public static <T> void printArr(T[] tArr){
		
			//제네릭은 배열 생성 불가,  배열 타입의 참조변수를 선언하는 것만 가능
		for(T t : tArr) {
			if(t instanceof Integer || t instanceof Long) {
				if((int)t % 3 == 0) {
					System.out.println(t);
				}else if(t instanceof Double || t instanceof Float) {
					System.out.println(t);
				}
			}
		}
		if(t % 3 == 0) {
			System.out.println(t);
		}	
		
	}
	
	//5
	public static <T extends Number> List<T> getMin(List<T> list){
		
		//배열만 받아서 
		//배열의 최소값구하고 리턴
		
	}
	
	public static <T> void printOverTen(){
		
		Map map = HashMap();
		
	}
	
	
	
}