package chap21_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import chap21_stream.clazz.CreditCard;

public class _16_groupingBy {

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
	
		//1. groupingBy메소드로
		//Map<company, List<CreditCard>>로 매핑
		
		Map<String, List<CreditCard>> CompanyCardMap = cardList.stream()
													.collect(Collectors.groupingBy(
													//키를 구하는 메소드 구현
													card -> card.getCompany()
													)
													);
		System.out.println(CompanyCardMap.toString());
		
		
		
		
		//2. groupingBy메소드로
		//   Map<company, average(limitMoney)>
		Map<String, Double> avgLimMoneyMap =
				cardList.stream()
						.collect(
								Collectors.groupingBy(
								//키를 구하는 메소드 구현
								card -> card.getCompany(),
								//밸류를 구하는 메소드 구현
								Collectors.averagingDouble(card -> card.getLimitMoney())
								)
						);
				System.out.println(avgLimMoneyMap.toString());
											
	}

}
