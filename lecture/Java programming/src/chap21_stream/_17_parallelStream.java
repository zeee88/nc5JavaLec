package chap21_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import chap19_multithread._08_NonSyncShareObj;

public class _17_parallelStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> scoreList = new ArrayList<Integer>();
		
		for(int i = 0; i < 1000000; i++) {
			scoreList.add((int)(Math.random() * 100));
		}
		
		//일반 스트림과 병렬 스트림의 속도 차이
		double avg = 0;
		long startTime = 0;
		long endTime = 0;
		
		//1. 일반스트림 평균 구하기
		Stream<Integer> scoreStream = 
							scoreList.stream();
		startTime = System.nanoTime();
		avg = scoreStream.mapToInt(num -> num)
							.average()
							.getAsDouble();
		endTime = System.nanoTime();
		
		System.out.println("일반 스트림 소요시간: " + (endTime - startTime));
		System.out.println("평균: " + avg);
		
		//2. 병렬 처리 속도 계산
		Stream<Integer> pScoreStream = scoreList.parallelStream();
		startTime = System.nanoTime();
		
		avg = pScoreStream.mapToInt(num -> num)
							.average()
							.getAsDouble();
		endTime = System.nanoTime();
		
		System.out.println("병렬스트림 소요시간: "+ (endTime - startTime));
		System.out.println("평균: " + avg);
		
	
		
	}

}
