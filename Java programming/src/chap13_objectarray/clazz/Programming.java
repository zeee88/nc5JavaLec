package chap13_objectarray.clazz;

public class Programming extends subjectCntTime implements ILecture{
	//extends랑 implements 같이 사용가능. 다만, extends를 먼저 써야함.
	
	
	public void programming(String subject, int studentCnt) {
		this.subject = subject;
		this.studentCnt= studentCnt;
	}
	
	@Override
	public void proceedLecture() {    //선언은 인터페이스에서. 자식클래스에서는 구현만
		System.out.println("학생 수는 40명 입니다.");
		
	}

}
