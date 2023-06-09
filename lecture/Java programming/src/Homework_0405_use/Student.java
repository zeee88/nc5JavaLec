package Homework_0405_use;

public class Student {

	private int sno;
	private String sName;
	private int score;
	private String grade;
	
	//생성자. 클래스명과 이름이 같아야 함. 리턴타입은 없어야 함.
	public Student(int sno, String sName, int score) {
		this.sno = sno;
		this.sName = sName;
		this.score = score;
	}


	public int getSno() {
		return sno;
	}


	public void setSno(int sno) {
		this.sno = sno;
	}


	public String getsName() {
		return sName;
	}


	public void setsName(String sName) {
		this.sName = sName;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}


	public String getGrade() {
		return grade;
	}



	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
	@Override			//<shift + alt + s>로 toString추가
	public String toString() {
		return "Student [sno=" + sno + ", sName=" + sName + ", score=" + score + ", grade=" + grade + "]";
	}
	
}
