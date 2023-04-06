package Homework_0405;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import Homework_0405_use.Card;
import Homework_0405_use.CardVali;

public class stream6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		action(cv -> {
			System.out.println(cv);		//메소드에 출력해주는 부분이 없으므로 action에서 출력해줘야 함.
		});
		
		
		List <Card> cardList = new ArrayList <Card>();
		
		cardList.add(new Card("a", 3));
		cardList.add(new Card("b", 1));
		cardList.add(new Card("c", 0));
		cardList.add(new Card("d", 1));
		cardList.add(new Card("e", 2));
		cardList.add(new Card("f", 5));
		
		
//		Stream <Card> cardStream = cardList.stream(); 
//		Stream <Card> filStream = cardStream.filter(a -> a.getValidYear() <= 1);
////		filStream.forEach(a -> System.out.println("카드이름: " + a.getCardName() + ", 유효기간: " + a.getValidYear()));
//	
//		filStream.forEach(a -> {
//				a.vaildEnlong(3);
//				System.out.println(a.getCardName() + "카드는 3년 연장되었습니다.");
//				System.out.println(a.toString());
//			});	//forEach 끝.
		
		
		
		
		
		//체이닝 기법
//		cardList.stream().filter(a -> a.getValidYear() <= 1)
//						.forEach(a -> System.out.println("카드이름: " + a.getCardName() + ", 유효기간: " + a.getValidYear()));
//		
//		cardList.stream().forEach(a -> {
//						a.vaildEnlong(3);
//						System.out.println(a.getCardName() + "3년 연장되었습니다.");
//						System.out.println(a.toString());
//						});
		
		
		
		
		
		
		
	}
	
	
	//8번. 6번에서 만든 validEnlong에서 연장할 유효기간과 CardVali를 매개변수로
    // 받아서 현재 유효기간 + 매개변수로 받아온 유효기간으로 변경해주고
    // 함수형 인터페이스 CardVali의 enlong을 호출합니다.
	
	public static void action(CardVali cv) {
		
		Card c = new Card();
		c.setValidYear(2);
		c.vaildEnlong(3);
		
		cv.enlong(c.getValidYear());
	}
	
	
	
	
	
	
	
	
	
	
	

}
