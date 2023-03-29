package chap12_nestedclass;

class NestedClass{				//클래스(NestedClass)안에 중첩 클래스(Add, Sub)만들기
		//Add 내부 클래스
		class Add{
		int num1;
		int num2;
		
		int result;
		final static int num5 = 10;  //상수. num5변수 값 지정

		//add함수 정의
		int add() {
			result = num1 + num2;
			return result;
		}
	}
	//Sub 내부 클래스
	static class Sub{
		static int num3;
		static int num4;
		
		static int result1;
		
		//Sub함수 정의
		static int sub() {
			result1 = num3 - num4;
			return result1;
		}
	}
}

public class _03_instanceOfNestedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 정적 중첩 클래스의 사용
		NestedClass.Sub.num3 = 10;			//클래스.함수.변수
		NestedClass.Sub.num4 = 5;
		System.out.println(NestedClass.Sub.sub());		//클래스.클래스.함수
		
		//2. 인스턴스 중첩 클래스의 사용
		//2-1. 외부클래스의 객체를 생성     		//static이 없으면 객체 생성
		NestedClass nc = new NestedClass();
		
		//2-2. 중첩 클래스의 객체 생성
		NestedClass.Add add = nc.new Add();		//클래스.클래스.변수명 = 위에 만든 객체이름 함수이름();
		add.num1 = 12;
		add.num2= 11;
		System.out.println(add.add());
		//final static으로 선언된 상수는 
		//객체 없이도 접근 가능
		System.out.println(NestedClass.Add.num5);		//클래스.클래스.변수

	}

}
