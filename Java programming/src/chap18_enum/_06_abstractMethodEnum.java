package chap18_enum;

import chap18_enum.enums.Calculator;

public class _06_abstractMethodEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//enum의 상수에 접근할 때는  "공통명칭.상수명"
		Calculator add = Calculator.PlUS;
		int result = add.calculate(10, 5);
		System.out.println(result);
		
		
		//values()는 열거형에 선언되어 있는 상수를 배열로 리턴
		Calculator[] cArr = Calculator.values();  
		for(Calculator c : cArr) {
			System.out.println(c.calculate(10, 4));
		}
		
	}

}
