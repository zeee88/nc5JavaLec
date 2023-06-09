package Homework_0406;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class stream2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		2. 메인메소드에서 (이도, 한글, 조선), (이순신, 임진왜란, 조선), (담덕, 세력확장, 고구려), (장영실, 측우기, 조선), 
//		(이성계, 조선건국, 조선), (을지문덕, 살수대첩, 고구려), (이승만, 초대대통령, 대한민국), (고주몽, 고려건국, 고려),
//	   (김구, 독립운동, 대한민국), (제갈공명, 책략가, 촉) 데이터를 갖는 List<HistoricPerson>를 만들어서 스트림으로 변환 후 
//		사용자가 입력한 업적 하나만 갖는 스트림을 생성하고 출력하세요.
		
		List<HistoricPerson> hisList = new ArrayList <HistoricPerson>();
		
		hisList.add(new HistoricPerson("이도", "한글", "조선"));
		hisList.add(new HistoricPerson("이순신", "임진왜란", "조선"));
		hisList.add(new HistoricPerson("담덕", "세력확장", "고구려"));
		hisList.add(new HistoricPerson("장영실", "측우기", "조선"));
		hisList.add(new HistoricPerson("이성계", "조선건국", "조선"));
		hisList.add(new HistoricPerson("을지문덕", "살수대첩", "고구려"));
		hisList.add(new HistoricPerson("이승만", "초대대통령", "대한민국"));
		hisList.add(new HistoricPerson("고주몽", "고려건국", "고려"));
		hisList.add(new HistoricPerson("김구", "독립운동", "대한민국"));
		hisList.add(new HistoricPerson("제갈공명", "책략가", "촉"));
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("인물의 업적을 입력하세요");
//		String input = sc.next();
		//방법1
//		hisList.stream().map(a -> a.getPersonInfo(input))		//sc.next() 바로 쓸 수 없음. 입력을 계속 받을 필요 없음
//				.filter(a -> !a.getName().equals(""))
//						.forEach(a -> System.out.println(a));
		
		//방법1-1
//		hisList.stream().map(a -> a.getPerInfo(input))
//						.forEach(a -> {
//							if(a != null) {
//								System.out.println(a);
//							}
//						});
		
		
		
		
//		3. 2번에서 만든 List를 스트림으로 변환하고 성이 '이'씨인 인물만 갖는 스트림을 만들고 출력하세요.
		
//		Stream <HistoricPerson> strStream = hisList.stream();
//		strStream.filter(a-> a.getName().charAt(0) == '이')
//					.forEach(a -> {
//					System.out.println(a);
//				});
		
		

//	  4. HistoricPerson에 getSameCountryPerson(String country)를 만들고
//    2번에서 만든 List를 스트림으로 변환하고 사용자가 입력한 국가의 인물들만 모은 스트림으로 만들어서 출력하세요. 
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("인물의 국가를 입력하세요");
		String str = sc.next();
		
		//메소드가 boolean일 때는 map사용 x. boolean을 통해 true로 나온 결과만
		//filter에서 걸러져서 forEach로 출력됨.
		hisList.stream().filter(a -> a.getSameCountryPerson(str))
						.forEach(a -> System.out.println(a.getName()));
		
		
		
//		5. 2번에서 만든 List를 스트림으로 변환하고 성이 두자 이상인 인물의 정보를 스트림으로 만들어서 출력하세요.(을지문덕, 제갈공명)
		
		
		
		
		
		//방법1
//		hisList.stream().filter(a -> a.getName().length() >= 4)
//						.forEach(a -> System.out.println(a));

		
		
		
		//방법2
//		String[] firstName = {"제갈", "을지", "독고", "황보", "남궁", "동방", "선우"};
//		
//		hisList.stream().filter(a ->{
//						for(String fName : firstName) {
//							if(a.getName().contains(fName)) {
//							return true;
//							}
//						}
//						return false;
//						})
//						.forEach(a -> System.out.println(a));
		
		
		
	}

}
