package chap18_enum;

import chap18_enum.enums.MethodMonth;

public class _05_methodOfEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodMonth.printMonth(5);
		
		MethodMonth aug = MethodMonth.AUG;
		aug.printAddMonth(3);
		aug.printAddMonth(7);
		aug.printAddMonth(36);
		
	}

}
