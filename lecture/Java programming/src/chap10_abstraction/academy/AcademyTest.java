package chap10_abstraction.academy;

import chap10_abstraction.product.Academy;
import chap10_abstraction.product.English_acad;
import chap10_abstraction.product.computer_acad;

public class AcademyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//추상클래스는 인스턴스화 불가
		
		Academy ac = new English_acad();
		ac.teach();
		ac.homework();
		ac.rest();
		ac.attend();
		
		System.out.println("----------------");
		
		ac = new computer_acad();
		
		ac.teach();
		ac.homework();
		ac.rest();
		ac.attend();
		
		
	}

}
