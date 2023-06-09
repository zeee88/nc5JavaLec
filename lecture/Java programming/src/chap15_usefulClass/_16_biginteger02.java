package chap15_usefulClass;

import java.math.BigInteger;

public class _16_biginteger02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		for(int i = 1; i < 100; i++) {
			System.out.println(i + "! =" + factorial(BigInteger.valueOf(i)));
			Thread.sleep(500);
		}
	}

	static BigInteger factorial(BigInteger n) {
		if(n.intValue() == 0) {
			//ONE은 BigInteger클래스의 상수.
			//즉, BigInteger클래스의 인스턴스를 생성할 때 사용되는 값이며, 
			//이 값은 정수 1을 뜻함.
			return BigInteger.ONE;     
		}else {
			//재귀메소드(함수) : 메소드안에서 해당 메소드 다시 호출.
			//이 결과는 함수의 재귀 호출에서 다시 factorial() 함수에 인수로 전달.
			//이것은 계속해서 인수를 1씩 감소시키며 함수를 재귀적으로 호출하는 방식으로
			//팩토리얼 값을 계산하는 것.
			return n.multiply(factorial((n.subtract(BigInteger.ONE))));
												//BigInteger - 1 과 같은 뜻.
		}
	}
	
}
