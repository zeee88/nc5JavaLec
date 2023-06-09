package chap21_stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_arrayToStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intArr = new int[10];
		
		for(int i = 0; i < 10; i++) {
			intArr [i] = (int)(Math.random() * 10) + 1;
			System.out.print(intArr[i] + ", " );
		}
		System.out.println();
		
							//IntStream.of(intArr);
		IntStream intStream= Arrays.stream(intArr);
		
		
		//5이상인 값들만 스트림으로 만들기
		
		intStream.filter(a -> a >= 5)
//				 .forEach(a -> System.out.println(a));     //main에 forEach에 쓰이는 변수명 intStream은 한 번만 사용가능. 두 개 이상이면 에러 발생.
		
		
		// *(곱)4 새로운 스트림 만들기
		.map(a -> a * 4)
		.forEach(a -> System.out.println(a));		
		
		
		
//	    .map(a -> {
//			a = a * 4;
//			return a;		  //map에서 return을 쓰려면 " = " 을 꼭 써야 함.
//			});
		
		Arrays.stream(intArr)
				.filter(a -> a >= 5)
				.map(a -> a * 4)
				.forEach(a -> System.out.print(a + ", "));
		
		
	}

}
