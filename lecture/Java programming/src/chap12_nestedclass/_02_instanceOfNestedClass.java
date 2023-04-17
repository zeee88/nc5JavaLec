package chap12_nestedclass;

import chap12_nestedclass.clazz.NestedClass;

public class _02_instanceOfNestedClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//외부클래스 객체 생성   //인스턴스 클래스의 객체를 만들기 위해....? 
		NestedClass nc = new NestedClass();
		
		//1. 인스턴스 클래스의 객체 생성     //(내부 클래스)
		NestedClass.Mul mul = nc.new Mul();

		//2. 정적 중첩 클래스의 객체 생성     //(static)  //nc 사용없이 바로 호출!
		NestedClass.Div div = new NestedClass.Div();
		
		//3-1. 정적 중첩 클래스의 정적 멤버에 접근
		System.out.println(NestedClass.Div.result);
		
		//3-2. 정적 중첩 클래스의 일반 멤버에 접근
		System.out.println(div.getNum3());
		
		//4. 인스턴스 중첩 클래스의 객체 사용
		mul.setNum1(150);
		mul.setNum2(15);
		mul.setResult(mul.getNum1() * mul.getNum2());
		System.out.println(mul.getResult());
		
		
		
		
		
		//중첩클래스의 객체 생성은 외부클래스의 객체를 사용해서
		//외부클래스의 객체.new 중첩클래스 생성자();
		
		//static으로 선언된 정적 중첩클랫의 객체는 
		//외부 클래스의 객체 없이도 생성 가능
		}

}

