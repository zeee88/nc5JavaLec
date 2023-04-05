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
			System.out.println(cv);
		});
		
		
List <Card> cardList = new ArrayList <Card>();
		
		cardList.add(new Card("a", 3));
		cardList.add(new Card("b", 1));
		cardList.add(new Card("c", 0));
		cardList.add(new Card("d", 1));
		cardList.add(new Card("e", 2));
		cardList.add(new Card("f", 5));
		
		
		Stream <Card> cardStream = cardList.stream(); 
		Stream <Card> filStream = cardStream.filter(a -> a.getValidYear() <= 1);
		filStream.forEach(a -> System.out.println("카드이름: " + a.getCardName() + ", 유효기간: " + a.getValidYear()));
	
		//11번. 
		Stream <Card> cardStream2 = cardList.stream();
		cardStream2.forEach(a -> {
			action(b -> a.setValidYear(a.getValidYear() + b));   //action
			//map()은 return이 있어야 함.
		 System.out.println("3년 연장되었습니다.");
		 System.out.println(a.getCardName() + "카드의 유효기간은 " + a.getValidYear() + "년 입니다.");
		 });	//forEach 끝.
		
		
	}
	
	
	public static void action(CardVali cv) {
		
		Card c = new Card();
		c.setValidYear(3);
		c.vaildEnlong(2);
		
		cv.enlong(c.getValidYear());
	}
	
	
	
	
	
	
	
	
	
	
	

}
