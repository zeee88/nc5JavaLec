package chap16_collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class _06_hashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> strSet = new HashSet<String>();
		//HashSet은 Set을 상속받아 구현된 클래스.  //Set은 데이터 저장에 순서가 없음.
		//추상클래스는 인스턴스화를 할 수 없음.
		
		strSet.add("Java");
		strSet.add("JDBC");
		strSet.add("Javascript");
		strSet.add("Html/Css");
		//중복 값 저장
		strSet.add("JDBC");
		strSet.add("Java");
		strSet.add("React.js");
		
		System.out.println("strSet의 크기 : " + strSet.size());
		
		
		int idx = 0;    //인덱스 초기화
		Iterator<String> it = strSet.iterator();
		
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(idx++ +" : "+ str);
			if(str.equals("Html/Css")) {
				System.out.println(idx++ +" : "+ str);
			}
		}
		
		strSet.remove("JDBC");
		System.out.println("strSet의 크기 : " + strSet.size());
		
		strSet.clear();
		if(strSet.isEmpty()) {
			System.out.println("strSet은 비어져 있습니다.");
		}else {
			System.out.println("strSet은 비어져 있지 않습니다.");
		}
	}

}
