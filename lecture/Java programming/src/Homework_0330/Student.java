package Homework_0330;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {

	private String name;
	private String sNum;
	private String major;
	
	
	
	//학생 정보 저장
	public void studentInfo(String name, String sNum, String major) {
		this.name = name;
		this.sNum = sNum;
		this.major = major;
		
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getsNum() {
		return sNum;
	}


	public void setsNum(String sNum) {
		this.sNum = sNum;
	}


	public String getMajor() {
		return major;
	}


	public void setMajor(String major) {
		this.major = major;
	}


	//학생 정보 출력
	public void studentPrint() {
		System.out.println("이름: " +  name);
		System.out.println("학번: " + sNum);
		System.out.println("전공: " + major);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<studentInfo> st = new ArrayList<studentInfo>();
		printInfo pi = new printInfo();
		Scanner sc = new Scanner(System.in);
		
		int chose;
		
		while(true) {
			System.out.println("메뉴를 고르세요");
			System.out.println("1. 학생정보 입력");
			System.out.println("2. 학생정보 검색");
			System.out.println("3. 학생정보 전체 출력");
			chose = sc.nextInt();
			sc.nextLine();
			
			switch(chose) {
			case 1: 
				st.add(pi.Input());
				break;
			case 2:
				System.out.println("이름 입력");
				String str = sc.next();
				st.get.studentPrint();
				break;
			case 3:
				for(studentInfo : st) {
					
				}
				
			}
		}
		
		
		
		Student student = new Student();
		student.name = "비트캠프";
		student.sNum = "2023";
		student.major = "컴퓨터공학";
		
		student.studentPrint();
		
	}
	
}
