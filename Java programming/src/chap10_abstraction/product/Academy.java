package chap10_abstraction.product;

public abstract class Academy {

	public int teamCnt;
	public int studentCnt;
	public int teacherCnt;
	public int subjectCnt;
	
	
	public abstract void teach();
	public abstract void homework();
	public abstract void rest();
	public abstract void attend();
}
