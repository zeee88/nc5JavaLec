package Homework_0330;

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

	
	//학생 정보 출력
	public void studentPrint() {
		System.out.println("이름: " +  name);
		System.out.println("학번: " + sNum);
		System.out.println("전공: " + major);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student student = new Student();
		student.name = "비트캠프";
		student.sNum = "2023";
		student.major = "컴퓨터공학";
		
		student.studentPrint();
		
	}
	
}
