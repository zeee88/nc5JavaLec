package chap21_stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class _09_numberConvertStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] intArr = new int[5];
		
		for(int i = 0; i < intArr.length; i++) {
			intArr[i] = (int)(Math.random() * 10) + 1;
		}
		
		IntStream intStream = Arrays.stream(intArr);
		
		intStream.asDoubleStream()
				 .forEach(dNum -> System.out.println(dNum));
		
		
		
		intStream = Arrays.stream(intArr);
		
		String printStr = "";
		
		intStream.boxed()		//box() 왜 해주는 거지??? 
				.forEach(iNum -> {
					System.out.println(iNum.intValue());
					System.out.println(iNum.getClass().getSimpleName());
				});
		
		
//		intStream.forEach(iNum -> System.out.println(iNum));
		
		
		
		
		
		//IntStream은 int값을 다루는 스트림이다. 그러나 때로 이를 객체로 다뤄야 하는 경우가 있다.
		//.boxed()메서드는 IntStream의 모든 요소를 해당하는 Integer 객체로 매핑하는데 사용된다.
		//즉, int값을 Integer객체로 박싱하기 위해 boxed()메소드를 사용한다.
		//원시타입에 대한 스트림을 클래스타입으로 전환하여 전용으로 실행하기 위해.
		//int자체로는 컬렉션에 못담기 때문에 Integer클래스로 변환하여 기능을 수행.
		//이렇게 객체스트림으로 변환하면 객체 지향 프로그래밍에서 제공하는 다양한 기능들을 사용할 수 있음.
		
		
		//위의 코드 해석
		//int값을 출력하기 위해 boxed()메소드를 사용하여 IntStream의 요소를 Integer 객체로 변환한 후 IntValue()메소드를 호출하여 int값을 출력.
		// 또한 getClass().getSimpleName() 메소드를 호출하여 해당 객체의 클래스 이름을 출력.
		
		
		
		
		
	}

}
