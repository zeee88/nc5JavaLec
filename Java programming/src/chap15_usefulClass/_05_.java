package chap15_usefulClass;

import java.util.Scanner;

public class _05_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(str.replaceAll("비트","")	
							 .replaceAll("네이버","")
							 .replaceAll("클라우드",""));
		
		sc.close();
		
		
	}

}
