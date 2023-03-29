package chap10_abstraction.product;

public class English_acad extends Academy{

	public void teamCnt(int teamCnt) {
		super.teamCnt = 6;
	}
	public void studentCnt(int student){
		super.studentCnt = 5;
	}
	public void teacherCnt(int teacherCnt){
		super.teacherCnt = 30;
	}
	public void Cnt(int Cnt){
		super.subjectCnt = 1;
	}
	
	//@Override : 오버라이드된 메소드라고 컴파일러에게 알림
	//@Override 없으면 컴파일러가 오버라이드된 메소드인지 부모와 자식을 계속 비교하면서 컴파일
	@Override
	public void teach() {
		System.out.println("영어를 가르치다.");
	}
	
	public void homework() {
		System.out.println("영어 숙제를 하다");
	}
	
	public void rest() {
		System.out.println("영어수업 쉬는시간에는 쉰다");
	}
	
	public void attend() {
		System.out.println("영어 수업에 학생들이 참석했다.");
	}
}
