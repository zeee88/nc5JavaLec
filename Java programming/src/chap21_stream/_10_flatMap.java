package chap21_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class _10_flatMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//{{1, 2}, {3, 4}, {5, 6}}
		//Stream<int[]>
		//Stream<Stream> .flatMap => Stream<Integer>
		
		int[][] intArr = {{1, 2}, {3, 4}, {5, 6}};
		
		Arrays.stream(intArr)
//	아래와 동일		.flatMapToInt(arr -> Arrays.stream(arr))
				.flatMapToInt(Arrays ::stream)
//				.map(num -> num)	//옵션사항. 없어도 됨
				.forEach(num -> System.out.println(num));
		
		
		
		
		
		
		
		
		
		
		
//		List<String> strList = new ArrayList<String>();
//		
//		strList.add("abc");
//		strList.add("def");
//		
//		List<String> returnList = new ArrayList<String>();
//		
//		strList.stream()
//				.flatMap(str -> Stream.generate(() -> str)
//									  .limit(2))
//				.forEach(str -> System.out.println(str));
//		
//		int[][] intArr = {{1, 2}, {2, 3}, {3, 4}};
//		
//		Arrays.stream(intArr)
//				.flatMap(arr -> Array :: stream)
//				.forEach
	}

}
