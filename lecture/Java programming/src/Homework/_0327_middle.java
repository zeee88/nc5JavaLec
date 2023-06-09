package Homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class _0327_middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		1. 학생이름을 key로 시험점수를 value로 가지는 Map<String, Integer>를 생성하고
//		   4명의 학생 데이터를 입력한 후 4명 중 최고 점을 맞은 학생의 이름과 점수를 출력하세요.

//		Map<String, Integer> map = new HashMap<String, Integer>();
//		
//		Map.Entry<String,Integer> max = null;		//max값 초기화
//		
//		map.put("가", 90);
//		map.put("나", 80);
//		map.put("다", 70);
//		map.put("라", 60);
//		
////		for(int i = 0; i < map.size(); i++) {
////			map.entrySet();		// Map에 저장되어 있는 key, value의 쌍을 
////								//Map.Entry 타입으로 저장된 Set을 리턴
////			}
//		
////		Set<Entry<String, Integer>>entrySet = map.entrySet();
//		
//		//entryset()은 Map의 모든 키-값의 쌍을 포함하는 Map.Entry 객체들의 Set를 반환
//		//for(키-값 쌍에 대한 자료형 지정 : Map.Entry 객체들의 Set를 반환을 반복)
//		for(Map.Entry<String, Integer>entry : map.entrySet()) {
//			if(max == null || entry.getValue()> max.getValue()) {
//				max = entry;
//			}
//		
//		}
//		
//		System.out.println( max.getKey() + max.getValue());
		
		
		
		
		
//		2. 정수 배열 {1, 2, 3, 4, 5}에서 두 수의 합을 구할 때 같은 값이 나오는 개수를 세서 
//		    Map<String, Integer>에 담은 후 출력하세요. 
//		    ex) {"3" : 1({1, 2}), "4" : 1({1, 3}, "5" : 2({1, 4}, {2, 3})
					//3은, 1개, 4는 1개, 5는 2개
		
		int[] nums = {1, 2, 3, 4, 5};
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {  //j = i + 1=> 본인과는 더해질 수 없기에
				int sum = nums[i] + nums[j];
				String key = String.valueOf(sum);	    //두 수의 합을 String 형태의 key로 출력
				int count = map.getOrDefault(key, 0);	//기존 맵(Map)에서 값이 있는 경우 값을 가져오고, 
														//그렇지 않은 경우 기본값 0을 가져옴				
				map.put(key, count + 1);
			}
		}
		
		System.out.println(map);
		
		
		
		
//		3. 16일 숙제였던 PhoneInfo를 List<Map<String, String>>이용하여 재구성하세요.
		
		
	}

}
