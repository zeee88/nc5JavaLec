package test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class _0410 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner sc = new Scanner(System.in);

		System.out.println("월을 입력하세요(1부터 12까지의 수)");
//		int inputM = sc.nextInt();
		System.out.println("일을 입력하세요");
//		int inputD = sc.nextInt();

		class Solution {
			public String solution(int a, int b) {
				String answer = "";
				int[] mArr = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
				String[] arr = { "THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED" };
				
//				a = inputM;
//				b = inputD;
				
				int sum = 0;

				for (int i = 1; i <= a; i++) {
					sum += mArr[i - 1];
				}

				int result = (sum + b) % 7;

				for (int i = 0; i < arr.length; i++) {
					if (result == i)
						answer = arr[i];

				}

				return answer;
			}
		}

	}
}