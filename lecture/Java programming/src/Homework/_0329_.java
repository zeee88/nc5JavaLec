package Homework;

import java.util.Scanner;

public class _0329_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		--------------------변수--------------------
//		1. 사용자가 입력한 이름, 나이, 성별을 출력하세요.
		
//		Scanner sc = new Scanner(System.in);
//		
//		String name = "";
//		int age;
//		String mw = "";
//		
//		System.out.println("이름을 입력하세요");
//		name = sc.next();     				//nextLine()은 엔터값이 들어가서 출력이 안 나올 수 있음.
//											//next()사용하기
//		System.out.println("나이를 입력하세요");
//		age = sc.nextInt();
//		System.out.println("성별을 입력하세요");
//		mw = sc.next();
//		
//		System.out.println("이름: " + name + " 나이: " + age + " 성별: " + mw);
		
		
		
		
//		2. 사용자가 입력한 두 개의 정수와 문자(char) 연산자를 받아 두 정수로 해당 연산을 진행한 결과를 출력하세요.
		
//		Scanner sc =  new Scanner(System.in);
//		
//
//		System.out.println("두 개의 정수와 연산를 입력해서 계산 결과를 확인하세요");
//
//		int i = sc.nextInt();
//		int j = sc.nextInt();
//		char ch = sc.next().charAt(0);  
//				//nextLine()은 String 타입에만 사용 가능. 따라서 char타입에 활용하려면 .charAt()을 해줘야 함.
//		int result = 0;
//		
//		switch(ch) {
//		case '+' :
//			result = i + j;
//			System.out.println(result);
//		break;
//		
//		case '-' : 
//			result = i - j;
//			System.out.println(result);
//		break;
//		
//		case '*' : 
//			result = i * j;
//			System.out.println(result);
//		break;
//		
//		case '/' : 
//			result = i / j;
//			System.out.println(result);
//		break;
//		
//		default :
//		System.out.println("잘못 입력하셨습니다.");
//		
//		}
	
		
		
		
//		3. 반지름이 20인 원의 넓이와 둘레를 출력하세요.(넓이 : 2 * 3.14 * 반지름 ^ 2, 둘레 : 4 * 3.14 * 반지름)
//		    단, 원주율 3.14는 상수로 선언하세요.
		
//		int r = 20;
//		final double rr = 3.14;
//		
//		System.out.println("넓이는 : " + 2*rr*r*r + " 둘레는 : " + 4*rr*r );
		
		
		
		
//		4. 사용자가 입력한 5개의 정수의 합계와 평균을 출력하세요.
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("5개의 정수를 입력하세요");
//		
//		int [] input = new int [5];
//		
//		int sum = 0;
//		int average = 0;
//		
//		for(int i = 0; i < input.length; i++) {
//			input[i] = sc.nextInt();		//사용자가 입력한 정수 i는 for문에서 선언 후에 저장되어야 하므로 
//			sum += input[i];				//for문 안에 쓰기
//		}
//		
//		average = sum /input.length;
//				
//		System.out.println("합계 : " + sum + "평균 : " + average);
		
		
		
		
//		5. 사용자가 입력한 세 정수의 최소 값, 중간 값, 최대 값을 출력하세요.
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("세 개의 정수를 입력하세요");
//		
//		int [] input = new int [3];
//		
//		//입력값 저장
//		for(int i = 0; i < 3; i++) {
//			input[i] = sc.nextInt();
//		}
//		
//		
//		//2중 for문으로 앞 뒤 값 비교하면서 바꿔주기(버블 정렬). 작을 수록 배열 앞부분.
//		for(int i = 0; i < input.length - 1; i++) {
//			for(int j = i + 1; j < input.length; j++) {
//				if(input[i] > input[j]) {
//				int tmp = input[i];
////				 	input[i] = input[j];
//				 	input[j] = tmp;
//				
//			}
//		}
//		}
//		System.out.println("최소값: " + input[0]);
//		System.out.println("중간값: " + input[1]);
//		System.out.println("최대값: " + input[2]);
		
		//max, min 설정해서 if문으로 구하는 방법
//		int max = 0;
//		int min = 0;
//		
//		for(int i = 0; i < input.length; i++ ) {
//			
//			input[i] = sc.nextInt();
//			
//			if(input[i] > max) {
//					input[i] = max;
//			}
//			
//			if(input[i] < min) {
//				input[i] = min;
//			}else if(input[i] < middle) {
//				input[i] = min;
//			}else 
//				input[i] = middle;
//		}
//		
//			System.out.println("max : " + max + "  middle: " + middle + "  min : " + min);
		

        
        
        
//		6. 사용자가 입력한 정수의 구구단을 출력하세요.(출력 양식 => 2를 입력했을 때 2 * 1 = 2
//													 			  2 * 2 = 4
//													 				 .....
//													  			  2 * 9 = 18 
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수 하나를 입력하세요");
//		
//		int input  = sc.nextInt();
//		for(int i = 1; i < 10; i++) {
//				System.out.print(input + " * " + i + " = " + input * i);
//				System.out.println();
//			}

		
		
		
//		7. 사용자가 입력한 정수로 해당 정수의 팩토리얼을 계산하여 출력하세요.(재귀메소드 없이, while이나 for 반복문을 사용)

//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수 하나를 입력하세요");
//		int input = sc.nextInt();
//		
//		int result = 1;							  //결과 값을 받을 공간을 마련해줘야함.
//			for(int i = 1; i <= input; i++) {
//				result *= i;
//			}
//			System.out.println(result);
		
	
		
		
//		8. 사용자가 입력한 10개의 정수 중 소수의 개수를 출력하세요.(소수는 1이랑 본인 말고는 나눠떨어지는 값이 없는 수입니다.)
//		   사용자가 입력할 수 있는 값은 2 ~ 30로 제한
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("정수 10개를 입력하세요 (2 ~ 30까지의 숫자만 입력 가능)");
//		
//		int count = 0;
//		
//        int [] Arr = new int [10];
//		for(int i = 0; i < Arr.length; i++) {
//			Arr[i] = sc.nextInt();
//		
//			if(2 <= Arr[i] && Arr[i] <= 30) {
//				boolean b = true;					//if문의 조건이 true이면 계속 시행.
//				for(int j = 2; j < Arr[i]; j++) {
//					if(Arr[i] % j == 0) {
//					b = false;						//false면 출력 값에서 제외
//					break;
//				}
//				}	
//				if(b) 								//b의 true, false를 판단해서 시행.
//						count++;
//			} 
//		else
//			System.out.println("2에서 30 사이의 숫자만 입력하세요");
//		}
//		System.out.println("입력한 수 중 소수의 갯수는 " + count + "개 입니다.");
		

		
		
	}


}
