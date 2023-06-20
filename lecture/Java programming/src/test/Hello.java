package test;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
	
		Scanner N = new Scanner(System.in);
		
		int inum = N.nextInt();
		String str = Integer.toString(inum);
		
		
		int sum1 = 0;
		for(int i = 0; i < str.length()/2; i++) {
			sum1 += str.charAt(i);
		}
		
		int sum2 = 0;
		for(int j = str.length()/2; j < str.length(); j++) {
			sum2 += str.charAt(j);
		}
		
		
		if(sum1 == sum2) {
			System.out.println("LUCKY");
		}else {
			System.out.println("READY");
		}
		
		
		
	}



}






