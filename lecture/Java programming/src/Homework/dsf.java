package Homework;
import java.util.Scanner;
public class dsf {
	

//		재귀메소드를 이용해 사용자가 입력한 숫자까지의 합을 구하시오.
		  
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();
			
			System.out.println(rec(input-1) + input);
			
		}
		public static int rec(int input) {
			
			if(input == 1) {
				return 1;
			} else {
				return  rec(input-1) + input;
			}
			
	}
}
