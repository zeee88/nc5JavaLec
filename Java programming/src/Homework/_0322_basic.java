package Homework;

import java.util.Scanner;

public class _0322_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
//		1. 사용자가 입력한 문자열을 받아서 가운데 문자를 출력하세요. 
//	    문자열의 길이가 짝수면 가운데 두 글자 출력. ex) 비둘기 -> 둘, 비트캠프 -> 트캠
		
//		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
//		
//		str.length();
//		
//		if((str.length())%2 == 0) {
//			System.out.println(str.substring((str.length())/2-1,(str.length())/2+1));
//		}else {
//			System.out.println(str.substring((str.length())/2,(str.length())/2+1));
//		}
		
		
//		2. 사용자가 입력한 문자열에서 가, 바의 개수를 새서 출력하세요.
//   	0개면 '가, 바가 존재하지 않습니다.'라고 출력.
	
		
		//<방법1>
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		int rkCnt = 0;
		int qkCnt = 0;
		
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == '가') {
				rkCnt++;
			}else if(input.charAt(i) == '바') {
				qkCnt++;
			}
		}
			if(rkCnt + qkCnt ==0) {
				System.out.println("가, 바가 존재하지 않습니다.");
			}else {
				System.out.println("가 : " + rkCnt + "개,"
								+ " 바 : " + qkCnt + "개");
										
			}
		
		//<방법2 메소드 사용>
//		Scanner sc = new Scanner(System.in);
//		String input = sc.nextLine();
//		
//		
//		System.out.println("가: "+countChar(input, '가'));
//		System.out.println("바: "+countChar(input, '바'));
//		
//		
//		int result = countChar(input, '가') +  countChar(input, '바');
//		System.out.println("총 개수는 : "+ result);
//		
//		if(result == 0) 
//			System.out.println("가, 바가 존재하지 않습니다.");
		
		
		//문자열의 길이를 셀 때 공백은 포함이 되지 않음.

		
			
//		3. 사용자가 입력한 문자열에서 알파벳의 모음을 제거하여 출력하세요.
//  	대문자 모음, 소문자 모음 모두 제거. 모음은 a, e, i, o, u

//		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
//		System.out.println(str.replaceAll("[aioueAIOUE]", ""));

//	
//		4. 사용자가 입력한 문자열1, 문자열2. 문자열1이 문자열2를 포함하면
//   	'포함합니다.'를 출력, 아니면 '포함하지 않습니다.'를 출력
		
//		Scanner sc = new Scanner(System.in);
//		String str1 = sc.nextLine();
//		String str2 = sc.nextLine();
//
//		if (str1.contains(str2) == true) {
//			System.out.println("포함합니다.");
//		} else {
//			System.out.println("포함하지 않습니다.");
//		}
		
		
		
		
	
	}
//	public static int countChar(String str, char ch) {
//		return str.length() - str.replace(String.valueOf(ch), "").length();
//	
//	}
}
