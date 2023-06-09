package Homework_0403;

import java.util.Scanner;

public class _01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		--------------------변수--------------------
//		1. 두 개의 정수 a = 10; b = 3;으로 덧셈, 뺄셈, 곱셈, 나눗셈의 결과를 출력하세요.
//		(나눗셈의 결과는 double형으로 나머지는 int형으로 출력)
		
//		int a = 10;
//		int b = 3;
//		
//		System.out.println(a + b);
//		System.out.println(a - b);
//		System.out.println(a * b);
//		System.out.println((double)a / b);
		
		
		
//		2. 두 개의 실수 num1 = 10.01; num2 = 12.25;로 덧셈, 뺄셈, 곱셈, 나눗셈의 결과를 출력하세요.
//		(네 연산 모두 double형 출력)
		
//		double num1 = 10.01;
//		double num2 = 12.25;
//		
//		System.out.println(num1 + num2);
//		System.out.println(num1 - num2);
//		System.out.println(num1 * num2);
//		System.out.println(num1 / num2);
		
		
		
		
		
//		3. 사용자가 입력한 알파벳을 소문자는 대문자로 대문자는 소문자로 변경해서 출력하세요.
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("알파벳 하나를 입력하세요");
//		char input = sc.next().charAt(0);
//		
//		
//		if(input >= 'A' && input <='Z') {
//			System.out.println((char)(input + 32));
//		}else if(input >= 'a' && input <= 'z') {
//			System.out.println((char)(input -32));
//		}
		
		
		
		
		
//		--------------------형변환--------------------
//		1. 사용자가 입력한 수(실수나 정수 모두 가능)를 StringBuilder로 받아서 
//		점(.)이 포함되면 double형으로 포함되지 않으면 int형으로 변경 후 출력하세요.
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("실수나 정수를 하나 입력하세요");
//		
//		StringBuilder sb = new StringBuilder(sc.nextLine());    //StringBuilder로 입력값 바로 저장
//		
//		//.을 포함하지 않은 경우 true반환(if문 실행), 포함할 경우 false반환(else문 실행)
//		//indexOf는 처음부터 검사하는데 () 안의 값을 못찾으면 -1을 리턴함
//		if(sb.indexOf(".") == -1) {
//			int a = Integer.parseInt(sb.toString());
//			System.out.println(a + (int)1);
//		}else {
//			double b = Double.parseDouble(sb.toString());
//			System.out.println(b + 1);
//		}
		
		
		
//		//<다른 방법>
//		String str = String.valueOf(sb);
//		if(str.contains(".")) {
//			double b = Double.parseDouble(str);
//			System.out.println(b + 1);
//		}else {
//			int a = Integer.parseInt(str);
//			System.out.println(a + (int)1);
//		}
				
		
		
		
		
//		--------------------연산자--------------------
//		1. public static void main(String[] args) {
//		    	for(int i = 1; i <= 10; i++) {
//				if() {
//					// 3, 6 ,9
//				} else if() {
//					// 1, 4, 7, 10
//				} else if() {
//					// 2, 5, 8
//				}
//			}
//		   }
//		   위 코드처럼 1 ~ 10까지의 숫자를 3가지 조건으로 나눌 때 가장 적합한 조건으로 채워주세요.

//				for(int i = 1; i <= 10; i++) {
//					if(i % 3 ==0) {
//						System.out.print("1: " + i);
//						System.out.println();
//					} else if(i % 3 == 1) {
//						System.out.print("2: " + i);
//						System.out.println();
//					} else if(i % 3 == 2) {
//						System.out.print("3: " + i);
//						System.out.println();
//					}
//				}
		
		
		
		
//		2. 중첩 삼항 연산자를 이용해서 1 ~ 20까지의 숫자중 소수를 판별하여 소수면 "xx는 소수입니다."라고 출력하고 
//		소수가 아니면 4의 배수인지 판별하여 "xx는 4의 배수입니다."라고 출력하고 
//		4의 배수가 아니면 "xx는 4의 배수가 아닙니다."라고 출력하세요.
		
		
//			for(int i = 1; i <= 20; i++) {
//				int cnt = 0;
//				for(int j = 2; j <= i; j++) {
//					if((i != j)&&(i%j == 0)) {
//						cnt++;						//소수가 아닌 수의 개수를 세준다
//					}	
//				}
//					System.out.println(cnt > 0 ?(i%4 == 0) ?
//						 i + "는 4의 배수입니다." : i + "는 4의 배수가 아닙니다.":  i + "소수입니다."); 
//				}
				
			
		
		
		
		
//		--------------------조건문--------------------
//		1. 사용자가 입력한 문자열의 길이가 20 이상이면 해당 문자열을 거꾸로 출력하고 
//		     20미만이면 문자열에 n, a, v, e, r 다섯개의 문자를 순서대로 추가하여
//		     문자열의 길이가 20이 되면 그 때 문자열을 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요");
		
		String input = sc.nextLine();
		
		if(input.length() >= 20) {
			
//			<방법1>
			for(int i = input.length()-1 ; i >= 0; i--) {
				System.out.print(input.charAt(i));
			}
				
//			<방법2>
//			StringBuilder sb = new StringBuilder(input);
//			System.out.println(sb.reverse().toString());
			
			
		}else {
				
//				StringBuilder sb = new StringBuilder(input);
//				sb.append("naver");
//				
//				while(sb.length() < 20) {
//					sb.append("");
//				}
//			
//				System.out.println(sb.toString());
				
				
				int cnt = 0;
				
				char [] chArr = {'n', 'a', 'v', 'e', 'r'};	
				
				for(int i = 0; i < 20 - input.length(); i++) {
					if(i < 5) {
						input = input.concat(String.valueOf(chArr[i]));
					}else {
						if(i%5 == 0) {cnt++;
						}
						input = input.concat(String.valueOf(chArr[i-(5*cnt)]));
					
					}
				
				}
		}
				System.out.println(input);
			
				
	
			
			
		
		
		
		
		
//		--------------------반복문--------------------
//		1. 1~20까지 랜덤한 값을 생성해서 생성한 랜덤 값만큼 반복되는 반복문을 만들고
//		    반복문에서 사용자가 입력한 문자열에 "bit"를 계속 추가하세요. 그리고 bit가 몇 번
//		    추가됐는지 개수를 세서 출력하세요. 랜던 값을 그대로 출력하면 안됩니다.

//		System.out.println("문자열을 입력하세요");
//		Scanner sc = new Scanner(System.in);
//		String input = sc.nextLine();
//		
//		for(int i = 1 ; i <= (int)(Math.random()*20) + 1; i++) {
//			input = input.concat("bit");
//		}
		
		
		
//		2. 사용자가 입력한 정수의 약수들의 총합을 출력하세요.
		
		
		
		
//		--------------------배열--------------------
//		1. 길이가 12인 char 배열을 선언하고 {'b', 'c', 's', 'i', 'i', 'o', 'q', 'n', 't', 'm', 'l', 't'}로 초기화합니다.
//		   단어를 bit, com, sql, int로 만들어서 모두 출력하세요.(힌트 bit => [0], [4], [8]에 있습니다.)
		
		
		
		//bit 배열 인덱스 = 048 4로 나누면 나머지 0
		//com 배열 인덱스 = 159 2로 나누면 나머지 1
		//sql 배열 인덱스 = 2610 
		//int 배열 인덱스 = 3711  4로 나누면 나머지 3
		
		
		//concat 사용
		//String.valueof
		
		
	}



}
