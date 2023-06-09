package Homework_0404;

public class IntArrUtils {
	
	
	public static void main(String[] args) {

		
//		4. 매개변수로 받아온 정수 배열에서 최대값, 최소값, 중간값을 구하는 메소드 getMax, getMin, getMid를 갖는 클래스 IntArrUtils를 구현하고
//	     maxOrMinOrMid라는 메소드를 갖는 함수형 인터페이스 MaxMinMid를 만들고 람다식으로 IntArrUtils의 메소드를 참조하여 구현하세요.
		
		
//		static이 안붙은 클래스는 먼저 new로 선언을 생성을 해줘야 함
//		만약 getMax 등 메소드에 static이 붙어있으면 객체 생성없이 action(IntArrUtils::getMac)로 사용 가능
//		static이 안붙어 있으면 무조건 먼저 객체 생성부터 해야 함.
		
		IntArrUtils is = new IntArrUtils();
		action(is::getMax);
		action(is::getMin);
		action(is::getMid);
	
	}
	
	//최대값 구하는 메소드
	public int getMax(int[] arr) {
		int max = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {		//arr[i] > arr[0] 이 아니라 변수명 'max' 을 써야 함.
				max = arr[i];
			}
		}
			return max;
	}
	
	
	
	
	//향상된 for문
//	for(int i : arr) {
//		if(i < min) {
//			min = i;
//		}
//	}
	
	
	
	//최소값 구하는 메소드
	public int getMin(int[] arr){
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {		//arr[0]이 아니라 min로 변수명을 써야 함.
				min = arr[i];
			}
		}
			return min;
	}
	
	//중간값 구하는 메소드
	public int getMid(int[] arr) {
		
		for(int i = 0; i < arr.length -1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				}
			}
		}
			int mid = arr[arr.length/2];	//배열의 길이 중 중간 인덱스. for문으로 중간값 구하는 것 설정 후 선언 및 초기화.
			return mid;
		
	}
	

	public static void action(MaxMinMid mmm) {
		int [] arr= {7, 8, 15, 5, 31, 94, 14, 88, 2};
		int result = mmm.maxOrMinOrMid(arr);		//interface에 있는 메소드 참조
		System.out.println(result);
		
	}
	
	
	
	
}
