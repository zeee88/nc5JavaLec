package Homework_0330;

public class Multiple {

	
//	private void syso() {
//		// TODO Auto-generated method stub
//		int num1 = 5;
//		double num2 = 10.23456;
//		double result= multipleResult(num1, num2);
//		
//		System.out.println(result);
//
//	}
	
	
	
	
	
	public static double multipleResult(int num1, double num2) {
		double result = num1 * num2;
		return Math.round(result*100)/100.00;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Multiple m = new Multiple();
		Multiple.multipleResult(5, 10.22222);
		
		
	}
	
}
