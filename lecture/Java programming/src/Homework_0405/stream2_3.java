package Homework_0405;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import Homework_0405_use.Student;

public class stream2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <Student> studentList = new ArrayList <Student>();
		
		
		studentList.add(new Student (1, "홍길동", 100));
		studentList.add(new Student (2, "임꺽정", 75));
		studentList.add(new Student (3, "장길산", 86));
		studentList.add(new Student (4, "정도전", 97));
		studentList.add(new Student (5, "이순신", 95));
		
		Stream <Student> studentStream = studentList.stream();
		Stream <Student> aStream = studentStream.filter(stu -> stu.getScore() >= 95);
				aStream.forEach(stu -> System.out.println("이름: " + stu.getsName() + ", 점수: " +	stu.getScore()));
		
				
				
		//문제 3번.
				//체이닝기법
		studentList.stream().map(m -> {
										m.setGrade("A+");
										return m;		//map에서 set은 설정만. 그리고 return이 있어야 함.
										})
										.forEach(m -> System.out.println(m.toString()));
										
				
	}

}
