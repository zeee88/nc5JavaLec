package Homework_0405_use;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Card {

	
	private String cardName;
	private int validYear;
	
	
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



	//8번
	
	public void vaildEnlong(int valid) {
		
		this.validYear += valid; 
		
		
		
		
	}
	
	
}
