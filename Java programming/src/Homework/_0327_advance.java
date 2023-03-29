package Homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class _0327_advance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 사용자가 입력한 문자열에서 가장 많이 등장하는 문자와 그 개수를 출력하세요.
//	    (Map<Character, Integer> 형태의 Map과 Entry 사용)

		Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력: ");
        StringBuilder str = new StringBuilder(sc.nextLine());
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        
        //Map.Entry<Character,Integer> entry =
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))){
            	//str.charAt(i)로 해당 키에 대한 값 가져옴.
            	//get() 메소드는 키(key)가 맵(Map)에 없는 경우 null을 반환하므로,
            	//Integer.valueOf() 메소드를 사용하여 null인 경우 0으로 값을 초기화.
            	//그리고 +1을 통해 기존 값(value)에 1을 더한다.
                map.replace(str.charAt(i), Integer.valueOf(map.get(str.charAt(i))+1));
            }
            else {
                map.put(str.charAt(i),1);
            }
        }
        Entry<Character,Integer> max = null;		//max값 초기화
        for(Entry<Character,Integer> i : map.entrySet()){
            if(max == null || i.getValue()>max.getValue()){
                max=i;
            }
        }
        System.out.println(map);
        System.out.println("제일 많이 나온 문자열: " + max.getKey() + "횟수: " + max.getValue());
    
		
//	2. 사용자가 입력한 5개의 정수를 저장하는 List<Integer>를 생성하고
//	    연속된 두 수의 합이 가장 커지는 구간의 두 수를 출력하세요.
//	    ex) [1, 2, 3, 4, 5] => 4, 5 출력
        
        
        
        
        //미들 2번과 비슷
        
        
//	3. 사용자가 입력한 6개의 정수를 저장하는 List<Integer>를 생성하고
//	    두 수의 합이 유일한 값이 되는 개수를 출력하세요.(중복 숫자 사용불가)
//	    ex) [1, 2, 3, 4, 5, 6] => 총 4개(3, 4, 10, 11)

        
        
//	4. 회원 클래스(private int no, private String id, private String name,
//		 private Date lastLoginDate, private String Status)를 만들고 getter와 
//	     setter를 만듭니다. lastLoginDate와 오늘날짜의 차를 날짜로 리턴하는 메소드
//	     public long getDiffDate();를 만들고 차가 365일 이상되는 회원의 상태를
//	     "N"으로 변경합니다. Status의 초기값은 "Y"로 주시고 List<Member>를 만들어
//	     10개의 데이터를 입력합니다. 10명중 정지된 회원의 수를 출력하세요.
	     
	}

}
