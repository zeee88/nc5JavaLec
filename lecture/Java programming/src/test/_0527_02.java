package test;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _0527_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		

		
		Map<String, Integer> map = new TreeMap<>();
		
		String input = sc.next();
		String ext = input.substring(input.indexOf(".")+1);
		
		if(map.containsKey(ext)) {
			int tmp = map.get(ext);
			map.replace(ext, ++tmp);
		}else {
			map.put(ext, 1);
		}
		
		
		
		
		for(String key: map.keySet()) {
		System.out.println(key + "" + map.get(key));
		}
	
	}

}
