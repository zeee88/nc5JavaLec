package Homework_0330;

import java.util.Random;
import java.util.Scanner;

public class _0330_1 {

	public static void main(String[] args) {
		
		
		
		// TODO Auto-generated method stub

//		1. 1부터 10까지의 정수를 배열에 저장하고 배열의 모든 요소를 출력하세요.
		
//		int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		
		
		
//		2. 사용자가 q를 입력하기 전까지 정수를 입력받아 배열에 저장하고 배열의 모든 요소를 출력하세요.
		
//		Scanner sc = new Scanner(System.in);
//		
//		int [] arr = new int[100];			//정수 배열 생성
//		
//		String input = sc.next();	//정수 입력받아야 하는데 String??
//		
//		while(true) {
//			System.out.println("정수를 입력하세요 (종료 : q)");
//			
//			if(input.equals("q")) {
//				
//				break;								//반복문 종료.
//			}
//			int num = Integer.parseInt(input);
//			
//		}
//			arr[i] = 
//					
//		for(int i = 0; i < 100; i++) {
//			
//		}

		
		
		
		
//		3. 사용자가 입력한 10개의 정수를 배열에 저장하고 평균을 계산하여 출력하세요.
		
//		int [] arr = new int[10];
//		
//		int sum = 0;
//		int cnt = 10;
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수 10개를 입력하세요");
//		for(int i = 0; i < arr.length; i++) {
//			arr[i]= sc.nextInt();
//			sum += arr[i];
//			
//		}
//		
//		System.out.println("입력한 정수들의 평균 : " + sum/cnt);
		
		
		
		
//		4. 1부터 100까지의 숫자 중에서 짝수만 배열에 저장하고 배열의 합을 계산하여 출력하세요.
		
//		int [] arr = new int[50];
//		int index = 0;
//		int sum = 0;
//		
//		for(int i = 2; i <= 100; i += 2) {			//짝수만 만들어서 차례대로 배열에 저장
//			arr[index] = i;
//			index++;
//			sum += i;				//i는 1~100까지의 짝수들
//			}
//			System.out.println(sum);
		
		
		
//		5. 사용자가 입력한 10개의 정수를 배열에 저장하고 최소값과 최대값을 찾아서 출력하세요.
		
//		int [] arr = new int [10];
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("정수 10개를 입력하세요");
//		
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		for(int i = 0; i < arr.length-1; i++) {
//			for(int j = i + 1; j < arr.length; j++) {
//				if(arr[i] > arr[j]) {
//					int tmp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = tmp;
//				}
//			}
//		}
//		System.out.println("최소값 : " + arr[0]);
//		System.out.println("최대값 : " + arr[9]);
		
		
//		6. 사용자가 입력한 5개의 문자열을 배열에 저장하고 길이가 가장 긴 문자열과 길이가 가장 작은 문자열을 출력하세요.
		
//		String strarr[] = new String[5];
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("문자열 5개를 입력하세요");
//		
//		for(int i = 0; i < strarr.length; i++) {
//			strarr[i] = sc.nextLine();
//		}
//		
//		for(int i = 0; i < strarr.length -1; i++) {
//			for(int j = i + 1; j < strarr.length; j++) {
//				if(strarr[i].length() > strarr[j].length()) {
//					String tmp = strarr[i];
//					strarr[i] = strarr[j];
//					strarr[j] = tmp;
//				}
//			}
//		}
//		
//		System.out.println("길이가 가장 긴 문자열 : " + strarr[4]);
//		System.out.println("길이가 가장 짧은 문자열 : " + strarr[0]);
		
		
		
		
//		7. 두 개의 정수형 배열을 만들고 1 ~ 100까지의 랜덤한 값으로 
//		첫 번째 배열은 4개 두 번째 배열은 3개를 저장하고 두 배열을 합친 새로운 배열을 생성하세요.
		
		int [] arr1 = new int[4];
		int [] arr2 = new int[3];
		
		int [] nArr = new int[arr1.length + arr2.length];  //두 개의 배열 합치기
		
		Random radom = new Random();		//랜덤한 값 생성
		int num = radom.nextInt(100) + 1;	//random.nextInt(100)는 0부터 99까지의 숫자만 반환하므로
											//100까지 포함하려면 +1을 해야함
		
		
		//랜덤값 저장
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = radom.nextInt();
			System.out.println("arr1 배열 : "+ arr1[i]);
		}
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = radom.nextInt();
			System.out.println("arr2 배열 : "+ arr2[i]);
		}
		
		//새로운 배열에 저장
		for(int i = 0; i < arr1.length; i++) {
			nArr[i] = arr1[i];
		}
		
		for(int i = 0; i < arr2.length; i++) {
			nArr[arr1.length] = arr2[i];
		}
		
		//배열 복사. arraycopy 함수
		
		//출력
		for(int i = 0; i < nArr.length; i++) {
			System.out.println(nArr[i]);
		}
		
		
	
		
		
		
//		8. 사용자가 문자열을 입력하는데 문자열 사이사이에 -을 넣어 구분자로 만들어준다.
//		 -기준으로 잘라진 문자열 배열을 생성하고 잘라진 문자열 중에
//		 가장 길이가 긴 문자열의 인덱스와 그 문자열을 출력하세요.

//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("문자열을 입력하세요");
//		String inputstr = sc.nextLine();
//		
//		String [] strArr = inputstr.split("-");       //입력한 값 사이 마다 "-" 넣기
//		
//		String maxLength = strArr[0];
//		
//		for(int i = 1; i < strArr.length; i++) {
//			if(strArr[i].length() > maxLength.length()) {		//변수명으로 넣어야 함.
//				maxLength = strArr[i];
//			}
//		}
//		System.out.println("가장 긴 문자열  : " + maxLength);
//				
//		sc.close();
		
		
		//????????????????????? 이거 맞아??????????????뭐야
		
		
		
	}

}
