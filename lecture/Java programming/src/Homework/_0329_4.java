package Homework;

import java.util.Scanner;

public class _0329_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1. 사용자가 입력한 두 정수 중에서 큰 정수를 출력하세요.
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("두 개의 정수를 입력하세요");
//		
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		
//		if(a > b) {
//			System.out.println("둘 중 더 큰 수는 " + a);
//		}else
//			System.out.println("둘 중 더 큰 수는 " + b);
		
	
		
//		2. 사용자가 입력한 정수가 양수면 "양수" 음수면 "음수"라고 출력하세요.
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("정수를 입력하세요.");
//		int input = sc.nextInt();
//		
//		if(input > 0) 
//			System.out.println("양수");
//		else if(input < 0)
//			System.out.println("음수");
//		else
//			System.out.println("0 입니다.");
		
		
		
		
//		3. 사용자가 입력한 문자열이 "Java"인 경우 "좋아하는 언어입니다."를 출력하고, "Python"인 경우 "공부중인 언어입니다."를 출력하고,
//		그렇지 않은 경우 "다른 언어를 공부해보세요."를 출력하세요.(switch~case~default 사용)
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("프로그래밍 언어를 하나 입력해보세요");
//		String str = sc.next();
//		
//		switch(str) {
//		
//		case "Java" :
//			System.out.println("좋아하는 언어입니다.");
//			break;
//		case "Python" :
//			System.out.println("공부중인 언어입니다.");
//			break;
//		default :
//			System.out.println("다른 언어를 공부해보세요.");
//		}
		
		
		
		
		
		
//		4. 사용자가 입력한 숫자가 3의 배수면 "3의 배수입니다."라고 출력하고 3의 배수가 아니면 "3의 배수가 아닙니다."를 출력하세요.(switch~case~default 사용)
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수를 하나 입력하세요.");
//		
//		int input = sc.nextInt();
//		
//		switch(input % 3) {
//		case 0 : 
//			System.out.println("3의 배수입니다.");
//			break;
//		default : 
//			System.out.println("3의 배수가 아닙니다.");
//		}
		
		
		
		
		
//		5. 사용자가 입력한 숫자가 홀수인 경우 "홀수입니다."를 출력하고, 짝수인 경우 "짝수입니다."를 출력하는 프로그램을 작성하세요.
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수를 하나 입력하세요.");
//		
//		int input = sc.nextInt();
//		
//		if(input % 2 == 0) 
//			System.out.println("짝수 입니다.");
//		else
//			System.out.println("홀수 입니다.");
		
		
		
		
//		6. 사용자가 입력한 5개의 정수중 가장 큰 수를 출력하세요.
		
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("정수 5개를 입력하세요");
//
//		int[] arr = new int[5];
//		for (int i = 0; i < arr.length; i++) { // 입력값 저장
//			arr[i] = sc.nextInt();
//		}
//
//		for (int i = 0; i < arr.length - 1; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] > arr[j]) {
//					int tmp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = tmp;
//				}
//			}
//		}
//
//		System.out.println(arr[4]);
	
		
		
		
		
//		7. 사용자가 입력한 문자열이 "Yes"인 경우 "예"를 출력하고, "No"인 경우 "아니오"를 출력하고, 그 외의 경우에는 "잘못 입력하셨습니다."를 출력하세요.
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Yes 또는 No를 입력하세요");
//		String str = sc.next();
//		
//		if(str.equals("Yes")) {
//			System.out.println("예");			    //문자열이 같은지 비교할 때는 == 이 아니라 .equals를 사용
//		}else if(str.equals("No")) {
//			System.out.println("아니오");
//		}else
//			System.out.println("잘못 입력하셨습니다.");
					
		
		
		
		
		
//		8. 사용자가 입력한 두 정수를 비교하여 같으면 "두 수가 같습니다." 첫 번째 수가 더 크면 "첫 번째 수가 더 큽니다." 두 번째 수가 더 크면 "두 번째 수가 더 큽니다."를 출력하세요.
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("첫쨰 정수를 입력하세요");
//		int input1 = sc.nextInt();
//		System.out.println("둘째 정수를 입력하세요");
//		int input2 = sc.nextInt();
//		
//		if(input1 == input2)
//			System.out.println("두 수가 같습니다.");
//		else if(input1 >= input2)
//			System.out.println("첫 번째 수가 더 큽니다.");
//		else
//			System.out.println("두 번째가 수가 더 큽니다.");
		
		
		
		
		
//		9. 사용자가 입력한 세 정수가 모두 짝수인 경우 "모두 짝수입니다." 모두 홀수인 경우 "모두 홀수입니다." 그 외의 경우 "짝수 : xxx개, 홀수 : xxx개 입니다."를 출력하세요.
		
		
		
		//방법1
//		Scanner sc  = new Scanner(System.in);
//		
//		int [] arr = new int[3];
//		int cnt = 0;
//		int acnt = 0;
//		
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//			if(arr[i] % 2 == 0) {
//				cnt++;
//			}else if(arr[i] % 2 != 0){
//				acnt++;
//			}
//		}
//		
//		if(cnt == 3)
//			System.out.println("모두 짝수 입니다.");
//		else if(acnt ==3)
//			System.out.println("모두 홀수 입니다.");
//		else
//			System.out.println("짝수는 : " + cnt + "홀수는 : " + acnt);
		
		
		
		//방법2
//		int input1 = sc.nextInt();
//		int input2 = sc.nextInt();
//		int input3 = sc.nextInt();
//		
//		int Cnt = 0;
//		int aCnt = 0;
//	
//			if(input1 % 2 == 0) {
//				Cnt++;
//			}else {
//				aCnt++;
//			}
//			
//			if(input2 % 2 == 0) {
//				Cnt++;
//			}else {
//				aCnt++;
//			}
//			if(input3 % 2 == 0) {
//				Cnt++;
//			}else {
//				aCnt++;
//			}
//			
//			if(Cnt == 3) {
//				System.out.println("모두 짝수입니다.");
//			}else if(aCnt == 3){
//				System.out.println("모두 홀수입니다.");
//			}else
//				System.out.println("짝수 : " + Cnt + "개, 홀수 : " + aCnt + "개 입니다.");
		
		
		
		
	}

}
