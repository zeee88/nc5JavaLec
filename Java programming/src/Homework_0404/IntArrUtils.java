package Homework_0404;

public class IntArrUtils {
	
	
	public static void main(String[] args) {

		
//		static이 안붙은 클래스는 먼저 new로 선언을 생성을 해줘야 함
//		만약 getMax 등 메소드에 static이 붙어있으면 객체 생성없이 action(IntArrUtils::getMac)로 사용 가능
		
		IntArrUtils is = new IntArrUtils();
		action(is::getMax);
		action(is::getMin);
		action(is::getMid);
	
	}
	
	public int getMax(int[] arr) {
		int max = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {		//arr[0]이 아니라 max로 변수명을 써야 함.
				max = arr[i];
			}
		}
			return max;
	}
	
	public int getMin(int[] arr){
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {		//arr[0]이 아니라 min로 변수명을 써야 함.
				min = arr[i];
			}
		}
			return min;
	}
	
	
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
		 int mid = arr[arr.length/2];		//배열의 길이 중 중간 인덱스
			return mid;
		
	}
	

	public static void action(MaxMinMid mmm) {
		int [] arr= {7, 8, 15, 5, 31, 94, 14, 88, 2};
		int result = mmm.maxOrMinOrMid(arr);
		System.out.println(result);
		
	}
	
	
	
	
}
