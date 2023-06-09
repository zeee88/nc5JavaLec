package chap21_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import chap21_stream.clazz.CreditCard;

public class _04_pipeLineEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<CreditCard> cardList = new ArrayList<CreditCard>();
		
		
		//카카오, 라이언카드, 1000
		//삼성카드, 탭탭카드, 2000
		//신한카드, 드림카드, 3000
		//삼성카드, ID카드, 5000
		//현대카드, 더블랙, 100000
		//아멕스, 블랙카드, 300000
		
		//스트림으로 한도가 5000이상인 카드의 회사와 카드이름 출력
		
		
		cardList.add(new CreditCard("카카오", "라이언카드", 1000));
		cardList.add(new CreditCard("삼성카드", "탭탭카드", 2000));
		cardList.add(new CreditCard("신한카드", "드림카드", 3000));
		cardList.add(new CreditCard("삼성카드", "ID카드", 5000));
		cardList.add(new CreditCard("현대카드", "더블랙", 100000));
		cardList.add(new CreditCard("아멕스", "블랙카드", 300000));
		
		
		
		
		//방법1.
//		Stream<CreditCard> cardStream = cardList.stream();
//		
//		Stream<CreditCard> filterStream = cardStream.filter(c -> c.getLimitMoney() >= 5000);
//		filterStream.forEach(card -> System.out.println(card.getCompany() + " : " + card.getCardName()));
		
		
		
		//방법2.
//		Stream<CreditCard> cardStream = cardList.stream();
		
		//cardList.stream()은 List<CreditCard>형에서 Stream<CreditCard>형으로 변환해주는 코드.
		//cardList.stream()은 CreditCard 객체 여러개가 저장된 스트림
		cardList.stream().filter(card -> card.getLimitMoney() >= 5000)
										.forEach(card -> System.out.println(card.getCompany() + " : " + card.getCardName()));
		
		
		//map() : 새로운 스트림을 만들어서 리턴
		//		  실행코드의 결과값으로 새로운 스트림 생성
		cardList.stream().map(c -> {
							c.setLimitMoney(c.getLimitMoney() + 3000);
							return c;
						})
						.forEach(c -> System.out.println(c.toString()));		
										//toString() 사용을 위해 클래스에 @override toString 추가해야 한다.
					
		
		//reduce 사용방법
		List<Integer> intList = new ArrayList<Integer>();
		
		for(int i = 0; i <= 30; i++) {
			intList.add(i);		//0부터 30까지의 숫자
		}
		
		int sum = intList.stream()
				.reduce((result, num) -> result + num)		//0부터 30까지의 숫자 합계
				.get();
		
		System.out.println(sum);
		
		
		
		
		
		
		
		//그 밖의 방법
//		String result2 = cardList.stream().filter(card -> card.getLimitMoney() >= 5000)
//										.map(card -> card.getCardName())
//										.collect(Collectors.joining(","));
//		
//		System.out.println("카드 이름: " + result2 );
		
		
		
	}

}
