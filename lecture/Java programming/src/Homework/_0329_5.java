package Homework;

import java.util.Scanner;

public class _0329_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1. 1부터 10까지의 정수의 합을 출력하세요.

//		int sum = 0;
//		
//		for(int i = 1; i <= 10; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
		
		
		
		
//		2. 2의 거듭제곱을 10회동안 반복하며 출력하세요.(2 * 2 = 4, 2 * 2 * 2 = 8 .....) 10회 반복 출력
		
		
//		int sum = 2;
//		
//		for(int i = 0; i < 10; i++) {
//			for(int j = 0; j <= i; j++) {
//				System.out.print("2 *");		//for문 안에서 계속 반복될 문자
//			}
//			sum *= 2;			//sum = sum * 2;
//			System.out.print("2 = " + sum);
//			System.out.println();		
//		}
		
		
		
		
//		3. 사용자가 입력한 정수까지의 모든 소수를 출력하세요.
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수를 하나 입력하세요");
//		
//		int input = sc.nextInt();
//		
//		
//		for(int i = 2; i <= input; i++) {
//			int cnt = 0;
//			
//			for(int j = 2; j <= i; j++) {
//				if(i % j == 0 && i != j) {  		//소수가 아닌 정수
//					cnt++;
//				}
//			}
//			if(cnt == 0)
//				System.out.println(i);			//사용자가 입력한 정수까지의 모든 소수 출력
//		
//		}
		

			
			
//		4. 사용자가 입력한 정수의 약수를  출력하세요.

//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수 하나를 입력하세요");
//		int input = sc.nextInt();
//		
//		for(int i = 1; i <= input; i++) {     //0은 0으로 나눌 수 없으므로 오류가 남. 그래서 i는 1부터 시작
//			if(input % i == 0) {
//				System.out.println(i);
//			}
//			
//		}
		
		
		
		
//		5. 사용자가 입력한 10개의 정수를 역순으로 출력하세요.(배열 사용)

//		Scanner sc = new Scanner(System.in);
//		
//		int [] arr = new int[10];
//		for(int i =0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();					 //먼저 입력을 받아서 저장
//		}
//		
//		for(int i = arr.length -1; i >= 0; i--) {
//			System.out.print(arr[i]);				 //이후 역순으로 출력
//		}
		
		
		
		
//		6. 사용자가 입력한 문자열을 역순으로 출력하세요.

//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("문자열을 입력하세요");
//		String str = sc.nextLine();
//		for(int i = 0; i < str.length(); i++) {
//			 str.charAt(i);
//		}
//		for(int j = str.length() - 1; j >= 0; j--) {    //str.length()부터 시작할때는 -1 꼭하기
//		System.out.print(str.charAt(j));
//		}
		
		
		
		
//		String str = sc.nextLine();
//		char[] ch = str.toCharArray();
		
		
		
		
//		7. 사용자가 입력한 두 정수의 최소공배수와 최대공약수를 출력하세요.

//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("두 개의 정수를 입력하세요");
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		
//		int gcd = 0;
//		
//		
//		//최대공약수
//		for(int i = 1; (i <= num1)&&(i <= num2); ++i) {
//			if(num1 % i == 0 && num2 % i == 0) {		//i는 num1과 num2의 약수
//				gcd = i;								//num1과 num2의 최대공약수
//				System.out.println(gcd);
//			}
//		}
//
//
//		
//		//최소공배수
//		int common = num1 * num2 / gcd;
//		
//		System.out.println("최대공약수: " + gcd);
//		System.out.println("최소공배수: " + common);
		
		
		
//		//최대공약수  20      30     30    20
//		int min = num1 > num2 ? num2 : num1;		//둘 중 더 작은 수를 구하는 코드
//		
//		int gcd = 1;
//		
//		for(int i = 1; i <= min; i++) {
//			if(num1 % i == 0 && num2 % i == 0) {		//i는 num1과 num2의 약수
//						gcd = i;						//num1과 num2의 최대공약수
//			}
//		}
//		
//		
//		//최소공배수
//		int common = num1 * num2 /gcd;
//		
//		System.out.println("최대공약수 : " + gcd);
//		System.out.println("최소공배수 : " + common);
		
		
		
		
		
//		8. 중첩 for문으로 이용해서 다음과 같이 출력하세요.

//		8-1. *
//		     **
//		     ***
//		     ****
//		     *****

//		for(int i = 1; i <= 5; i++) {
//			for(int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//		System.out.println(" ");
//		}

		
		
		
//		8-2. *****
//		      ****
//		       ***
//		        **
//		         *

		
//		for(int i = 1; i <= 5; i++) {
//			for(int j = 1; j <=5; j++) {
//				if(i>j) {
//					System.out.print(" ");	
//				} else {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
		
		
//		for(int i = 1; i <= 5; i++) {
//			for(int j = 1; j < i; j++) {
//				System.out.print(" ");
//			}
//			for(int j = 5; j >= i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		} 
		
		
		
		
//		8-3.    
//		*****
//		****
//		***
//		**
//		*
		
//		for(int i = 5; i >= 1; i--) {
//			for(int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}	
		
		
		
		
//		8-4.
//			*
//		   **
//		  ***
//		 **** 
//		*****
		
//		for(int i = 5; i >= 1; i--) {
//			for(int j = 1; j < i; j++) {
//				System.out.print(" ");
//			}
//			for(int j = 5; j >= i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		

		
//		9. 사용자가 q를 입력하기 전까지 계속 반복하면서 입력한 정수의 값을 더해서 출력하세요.
		
//		Scanner sc = new Scanner(System.in);
//		
//		int [] arr = new int [100];
//		int size = 0;
//		int sum = 0;
//		
//		while(true) {
//			System.out.println("정수를 입력하세요(q입력 시 종료)");
//			String input = sc.nextLine();
//			
//			if(input.equals("q")) {
//				break;
//			}
//			
//			try{
//				int num = Integer.parseInt(input);
//				arr[size++] = num;
//				sum += num;
//			}catch(NumberFormatException e) {
//				System.out.println("잘못된 입력입니다. 다시 입력해주세요");
//			}
//			
//			
//		}
//		
//		System.out.println("입력한 정수는");
//		System.out.println(sum);
//		
		
			
			
			
			
			
			
			
	}

}
