package chap21_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import chap21_stream.clazz.CreditCard;

public class _15_collect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<CreditCard> cardList = new ArrayList<CreditCard>();
		
		cardList.add(new CreditCard ("a", "A", 100));
		cardList.add(new CreditCard ("a", "B", 100));
		cardList.add(new CreditCard ("a", "C", 100));
		cardList.add(new CreditCard ("b", "D", 100));
		cardList.add(new CreditCard ("b", "E", 100));
		cardList.add(new CreditCard ("c", "F", 100));
		cardList.add(new CreditCard ("c", "G", 100));
	
		
		//1. 특정 카드사의 카드만 뽑아서 collect로 수집 후 리스트로 변환
		
		List<CreditCard> aCompanyCardList = cardList.stream()
													.filter(card -> card.getCompany().equals("a"))
													.collect(Collectors.toList());
		
		System.out.println(aCompanyCardList.toString());
		
		
		//2. Map<cardname, limitmoney> 변환
		Map<String, Integer> cardMap = cardList.stream()
											.filter(card -> card.getLimitMoney() >= 100)
											.collect(
													Collectors.toMap(
														card -> card.getCardName(),
														card -> card.getLimitMoney())
															
													);
						System.out.println(cardMap.toString());
											
		
		
		
		
		
	}

}
