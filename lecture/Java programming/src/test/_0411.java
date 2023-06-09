package test;

import java.util.HashMap;
import java.util.Map;

public class _0411 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		완주하지 못한 선수
//		수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
//		마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 
//		완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
//
//		마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
//		completion의 길이는 participant의 길이보다 1 작습니다.
//		참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
//		참가자 중에는 동명이인이 있을 수 있습니다.

		String[] participant = { "aa", "bb", "cc", "dd", "ee" };
		String[] completion = { "aa", "bb", "cc", "dd" };

		//map을 이용해서
		//participant에 있으면 +1
		//completion에 있으면 +1, 없으면 0
		//없는 것만 return
		
		
		Map<String, Integer> map = solution(participant);
		
		
	
}
		
		class Solution {
			public String solution(String[] participant, String[] completion) {
				String answer = "";
				
				Map<String, Integer> map = new HashMap<String, Integer>();
				
				for(String str : participant) {
					if(!map.containsKey(str)) {		//기존에 없으면 
						map.put(str, 1);			// +1
					}else {
						map.put(str,  map.get(str) + 1);	//기존에 있으면 거기에 +1
					}
				}
				
				
				for(String str : completion) {
					if(map.containsKey(str)) {
						map.put(str, -1);
					}else {
						map.put(str, map.get(str) - 1);
					}
				}
				
				
				
				return map;
				
	
			}
		}

}

