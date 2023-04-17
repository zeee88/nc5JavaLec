package Homework_0405_use;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Card {

	
	private String cardName;
	private int validYear;
	
	//기본생성자. 객체마다 다른 갯수의 매개변수가가 필요할 때 생성. 그 외에는 생성 안해도 됨.
	public Card() {
		
	}
	
	public Card(String cardName, int vaildYear) {
		this.cardName = cardName;
		this.validYear = vaildYear;
		
	}

	
	public String getCardName() {
		return cardName;
	}
	
	
	
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	
	
	
	public int getValidYear() {
		return validYear;
	}
	
	
	
	public void setValidYear(int validYear) {
		this.validYear = validYear;
	
	
	}

	@Override
	public String toString() {
		return "Card [cardName=" + cardName + ", validYear=" + validYear + "]";
	}


	//8번. 6번에서 만든 validEnlong에서 연장할 유효기간과 CardVali를 매개변수로
    // 받아서 현재 유효기간 + 매개변수로 받아온 유효기간으로 변경해주고
    // 함수형 인터페이스 CardVali의 enlong을 호출합니다.
	

	public void vaildEnlong(int valid) {
		
		this.validYear += valid; 		//유효기간 연장
		
		
		
		
	}
	
	
}
