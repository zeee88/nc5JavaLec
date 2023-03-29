package chap15_usefulClass;

import java.util.Scanner;

public class _10_MathEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//사용자가 5개의 정수 입력 = 배열에 저장
		
		Scanner sc = new Scanner(System.in);
		System.out.println("5개의 정수를 입력하세요");
		int [] arr = new int [5];
		
		for(int i= 0; i< arr.length; i++) {
		arr [i] = sc.nextInt();
		}
		//Math.max와 Math.min을 이용하여 최대값과 최소값 구하기
		int max = arr[0]; 
		int min = arr[0];   //먼저 최대, 최소값 배열의 첫번째 숫자로 초기화
		
		for(int i = 0; i < arr.length; i++) {
			max = Math.max(max,arr[i]);
			min = Math.min(min,arr[i]);
			
		}
		
		System.out.println(max);
		System.out.println(min);
		
		sc.close();
	}

}
