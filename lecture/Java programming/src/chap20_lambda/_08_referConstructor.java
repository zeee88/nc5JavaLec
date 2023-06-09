package chap20_lambda;

import chap20_lambda.clazz.Academy;
import chap20_lambda.clazz.ComAcademy;
import chap20_lambda.clazz.EngAcademy;

public class _08_referConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		comLectureInfo((str, num)-> {
//			return new Academy(str, num);
//		});			//이 코드를 간단하게 표현한 것이 밑의 코드
		
		
		//생성자 참조(클래스 :: new)
		comLectureInfo(Academy :: new);
		
		engLectureInfo(Academy :: new);
		
	}

	
	public static void comLectureInfo(ComAcademy ca) {
		Academy ac = ca.getComAcademy("컴퓨터", 50);
		
		ac.setLecTime(10);
		ac.lectureInfo();
	}

	
	public static void engLectureInfo(EngAcademy ea) {
		Academy ac = ea.getEngAcademy("영어");
		
//		ac.setLecTime(50);
		ac.lectureInfo();
	}
	
	
	
	
}
