package etc;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class _0410 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println( "mmdd 형식으로 날짜를 입력하세요");
		String input = sc.next();
		
		int a = 0;
		int b = 0;
		
		int [] mArr = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		String [] arr = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
		
		//입력을 받아온 월과 일까지 총 일 수를 구하기
		//만약 5월 24일 이면 4월까지의 총일 수 + 5월의 일수
		for(int i = 0; i < mArr.length; i++) {
			
			
		} 
		
			for(int i = 0; i < arr.length; i++) {
				switch(mArr[i]  % 7) {
					case 0: 
						arr[i] = "FRI";
						break;
					case 1: 
						arr[i] = "SAT";
						break;
					case 2: 
						arr[i] = "SUN";
						break;
					case 3: 
						arr[i] = "MON";
						break;
					case 4: 
						arr[i] = "TUE";
						break;
					case 5: 
						arr[i] = "WED";
						break;
					case 6: 
						arr[i] = "THU";
						break;
					default:
						break;
					
				}
			}
			
			}
		}
	
		
		
		
//		while(true) {
//				if((year % 400 == 0)||((year % 4 == 0)&&(year % 100 != 0))) {
//						for(int i = 0; i < yearCnt; i++) {
//							if(index >= arr.length) {
//								index = 0;
//								System.out.println(arr[index]);
//						}
//				}
//				}
//				
//			
//				
//			}
//		
		
		

