package Homework._0321;

import java.util.Scanner;

public class employeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		employee[] ee = new employee[100];
		
		Scanner sc = new Scanner(System.in);
		
		int eno = 0;
		String name = "";
		long pay = 0;
		double bonus = 0;
		int hireYear = 0;
		int workDay = 0;
		
		while(true) {
            System.out.println("1. 정규직 저장");
            System.out.println("2. 임시직 저장");
            System.out.println("3. 계약직 저장");
            System.out.println("4. 전체 정보 출력");
            System.out.println("5. 월급 계산 출력");
            System.out.println("6. 프로그램 종료");
		}
		
		int choice = sc.nextInt();
		
		
		ee.getMonthPay();
		ee.showEmployeeInfo();
		
		switch(choice) {
		case 1:
			int eno= sc.nextInt();
			String name = sc.nextLine();
			long pay = sc.nextInt();
			double bonus = sc.nextInt();
			break;
		case 2:
			int eno= sc.nextInt();
			String name = sc.nextLine();
			long pay = sc.nextInt();
			int hireYear = sc.nextInt();
			break;
		case 3:
			int eno= sc.nextInt();
			String name = sc.nextLine();
			long pay = sc.nextInt();
			double workDay = sc.nextInt();
			break;
		case 4:
			System.out.println(employee[0]);
			System.out.println(employee[1]);
			System.out.println(employee[2]);
			System.out.println(employee[3]);
			break;
		case 5:
			System.out.println(getMonthPay());
			break;
		case 6:
			sc.close();
			System.exit();
			
		}
		
	}

}
