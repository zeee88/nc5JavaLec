package Homework;

import java.math.BigInteger;
import java.util.Scanner;

public class _0323_middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 크기가 30인 StringBuffer에 "hello"라는 문자열이 담겨있다.
//	    비어있는 바이트의 공간을 b, i, t가 반복되어 들어가도록 모두 채우세요.

//		StringBuffer sb = new StringBuffer(30);
//		sb.append("Hello");
//		for (int i = 0; i < sb.capacity() - sb.length(); i++) {
//
//			sb.append('b').append('i').append('t');
//		}
//		System.out.println(sb);
				//베이직 2번과 비슷. 참고
		
		
//		2. "유용한 클래스는 많다. 다양한 라이브러리를 활용한다."라는 문자열이 있을때
//	     사용자가 정수를 입력하고 문자열을 거꾸로 만든 문자열의 정수 인덱스의 문자를 출력하세요.

//		Scanner sc = new Scanner(System.in);
		
//		StringBuffer sb = new StringBuffer("유용한 클래스는 많다. 다양한 라이브러리를 활용한다.");
//		sb.reverse();
//		System.out.println(sb);
//		System.out.println("정수를 입력하세요");
//		int num = sc.nextInt();
//		System.out.println(sb.charAt(num));
		
		
//		3. 처음에 은행에 맡긴 돈은 10000원입니다
//	   		금리는 연 10%입니다
//	   		복리이자로 계산했을 때 10년후 얼마가 될까요?

		
//				double money = 10000;
//		        System.out.println(bank(10));
//		    }
//	
//			// b는 금리
//		    static double bank(int b){
//		        if(b==0) return 10000;             //재귀함수
//		        else return 1.1*(bank(b-1));       // b-1은 b에서 1씩 감소한다는 의미
				
//		int money = 10000;
//		for(int i = 1; i <=10; i++) {
//			money *= 1.1;
//		}
//		System.out.println(money);
		
		
//		4. 재귀메소드를 이용해 사용자가 입력한 숫자까지의 합을 구하시오.

		//방법1
				Scanner sc = new Scanner(System.in);
				System.out.println("숫자를 입력하세요 : ");
				int input = sc.nextInt();
//
//				System.out.println(input + funtion(input - 1));
//
//			}
//
//			static int funtion(int input) {
//				if (input == 1) {
//					return 1;
//				} else
//					return input + funtion(input - 1);
//
//			}
			
				
				//방법2
				
//				for(int i = 1 ; i < input; i++) {
//					System.out.println(a(BigInteger.valueOf(i)));
//				}
//				
//				static BigInteger a (BigInteger big) {
//					if(big.intValue() != 0) {
//						return big.add(a(big.subtract(BigInteger.ONE)));
//					}else
//						return BigInteger.ZERO;
//				}
//			
//			
//			
//			
//			
//		}
			
		



		

