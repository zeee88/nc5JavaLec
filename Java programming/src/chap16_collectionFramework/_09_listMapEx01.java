package chap16_collectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import chap06_class.car.Car;

public class _09_listMapEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Car> carList = new ArrayList<Car>();
		carList.add(new Car("현대", "제네시스", "흰색", 5000));
		carList.add(new Car("기아", "모하비", "흰색", 5000));
		carList.add(new Car("쉐보레", "카마로", "노란색", 5000));
		carList.add(new Car("벤츠", "E시리즈", "흰색", 6000));
		carList.add(new Car("BMW", "7시리즈", "파란색", 10000));
		
		//carList를 List<Map<String, Object>>로 변환
		
		List<Map<String, Object>> mapList = new ArrayList<Map<String, Object>>();
		
		for(Car c : carList) {
			Map<String, Object> map = 
					new HashMap<String, Object>();
			map.put("company", c.company);  //put: key와 value의 쌍을 만들어서 Map에 저장.
			map.put("model", c.model);
			map.put("color", c.color);
			map.put("price", c.price);
			
			mapList.add(map);
		}
		
		for(int i = 0 ; i < mapList.size(); i++) {   //size() : Map에 존재하는 key, value의 쌍의 개수를 리턴.
			System.out.println(mapList.get(i));  //get() : 매개변수로 받은 key로 value를 꺼내온다.
		}
	}

}
