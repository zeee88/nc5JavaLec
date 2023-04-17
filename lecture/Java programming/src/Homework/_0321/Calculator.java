package Homework._0321;

class NestedClass {

	// 1. add클래스
	class Add {
		int a;
		int b;

		int result1;

		int add() {
			int result1 = a + b;
			return result1;
		}

		//return a + b;    => 이렇게 간단하게 하는 방법
		
	}

	// 2. sub클래스
	class Sub {
		int a;
		int b;

		int result2;

		int sub() {
			int result2 = a - b;
			return result2;
		}
	}

	// 3. mul클래스
	class Mul {
		int a;
		int b;

		int result3;

		int mul() {
			int result3 = a * b;
			return result3;

		}
	}

	// 4. div클래스
	class Div {
		int a;
		int b;

		int result4;

		int div() {
			int result4 = a / b;
			return result4;
		}
	}
}

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 외부 클래스 객체 생성  //static 없는 class는 객체를 생성해줘야 함
		NestedClass nc = new NestedClass();  //외부클래스.변수명 = 

		// 1. 중첩 클래스 객체 생성(add)
		NestedClass.Add add = nc.new Add();		//외부클래스.내부클래스.변수명

		add.a = 50;
		add.b = 20;
		System.out.println(add.add());

		// 2. 중첩 클래스 객체 생성(sub)
		NestedClass.Sub sub = nc.new Sub();

		sub.a = 50;
		sub.b = 20;
		System.out.println(sub.sub());

		// 3. 중첩 클래스 객체 생성(mul)
		NestedClass.Mul mul = nc.new Mul();

		mul.a = 50;
		mul.b = 20;
		System.out.println(mul.mul());

		// 4. 중첩 클래스 객체 생성(div)
		NestedClass.Div div = nc.new Div();

		div.a = 50;
		div.b = 20;
		System.out.println(div.div());

	}

}
