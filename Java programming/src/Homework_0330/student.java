package Homework_0330;

public class Student {

	public String name;
	public String sNum;
	public String major;
	
	
	
	//학생 정보 저장
	public void studentInfo(String name, String sNum, String major) {
		this.name = name;
		this.sNum = sNum;
		this.major = major;
		
	}

	
	//학생 정보 출력
	public void studentPrint() {
		System.out.println("이름: " +  name);
		System.out.println("학번: " + sNum);
		System.out.println("전공: " + major);
	}
	
}