package Homework;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class _0324_middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1. 사용자가 입력한 날짜(yyyy-MM-dd 형식으로 입력받음)에 add 메소드로 3일뒤로 변경하고
//	     yyyy-MM-dd 형식으로 출력하세요. (SimpleDateFormat 클래스 사용. SimpleDateFormat의
//	     parse() 메소드를 이용하면 String -> Date로 변환가능)

		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("yyyy-MM-dd 형식으로 날짜를 입력해주세요");
//		String input = sc.nextLine();
//		SimpleDateFormat input = new SimpleDateFormat("yyyy-MM-dd");
//		SimpleDateFormat out = new SimpleDateFormat("yyyy-MM-dd");
//		
//		if{
//			Date date = input.parse(input);
//			System.out.println(input);
//		}
//		
//		cal.add(Calendar.DATE, 3);
		
		
		
//	2. 길이가 8이며 한글로 된 요일이 저장되어 있는 요일 배열을 만들고
//	   사용자가 입력한 날짜(yyyy-MM-dd 형식으로 입력받음)의 요일을 한글로 출력하세요.

		
		String [] arr = {"", "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("yyyy-MM-dd 형식으로 날짜를 입력하세요");
		String input = sc.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				
		Calendar cal = Calendar.getInstance();
				
		System.out.println(arr[cal.get(Calendar.DAY_OF_WEEK)]);
		
		
		
//	3. 두 개의 날짜 데이터 2023-03-15 20:31:45와 2021-07-08 11:58:04의 차이를
//	     시 분 초 형태로 나타내시오.
		
//		Calendar cal = Calendar.getInstance();
//		cal.set(2023, 03, 15, 20, 31, 45);
//		Calendar cal2 = Calendar.getInstance();
//		cal2.set(2021, 07, 8, 11, 58, 04);
//		
//		long diff = cal.getTimeInMillis() - cal2.getTimeInMillis();
//		
//		//1000은 밀리커리세컨드
//		//60초  60분  24시간  30일  12달
//		long year = diff/((long)1000*60*60*24*30*12);
//		diff = diff % ((long)1000*60*60*24*30*12);
//		long month = diff/((long)1000*60*60*24*30);
//		diff = diff % ((long)1000*60*60*24*30);
//		long date = diff/(1000*60*60*24);
//		diff = diff % (1000*60*60*24);
//		long hour= diff/(1000*60*60);
//		diff = diff % (1000*60*60);
//		long minute= diff/(1000*60);
//		diff = diff % (1000*60);
//		long second= diff/1000;
//		diff = diff % 1000;
//		
//		System.out.println(year + "년 " + month + "개월 " + date + "일 " + hour 
//				+ "시간 " + minute + "분 " + second + "초");
//		
		
		
		
		
	}

}
