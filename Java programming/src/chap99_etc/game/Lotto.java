package chap99_etc.game;

import java.util.Random;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {

		// 1~45까지 7개의 난수(중복제거)
		//당첨번호 담아줄 배열 6개 + 보너스 번호 1개
		// 7번째 숫자는 보너스 번호
		
		int[] lotto = new int[7];

		
		Random rand = new Random();
		

		// 사용자 번호 담아줄 배열
		// 1등 : 보너스 번호를 제외한 6개의 숫자가 모두 같을 때
		// 2등 : 보너스 번호와 5개 번호가 일치할 때
		// 3등 : 보너스 번호를 제외한 5개의 숫자가 일치할 때
		// 4등 : 보너스 번호를 제외한 4개의 숫자가 일치할 때
		// 5등 : 보너스 번호를 제외한 3개의 숫자가 일치할 때
		// 나머지는 꽝
		int[] userNum = new int[6];
		
		int matchCnt = 0;		  //맞은 숫자 개수 세는 변수

		boolean bonus = false;		//보너스 번호 맞았는지 확인하는 변수. 맞으면 true로 변경
		
		// 사용자가 1~45까지 6개 숫자 선택(중복제거)
		Scanner sc = new Scanner(System.in);
		System.out.println("1~ 45까지 중 6개의 숫자를 입력하세요");
		int user = sc.nextInt();
		
		//override
		
		
		//7개의 랜덤값(중복은 제거) lotto에 담아주는 메소드
		//void gernerateRandom
		public void generateRandom() {
			for(int i = 0; i < lottoNum.length; i++) {
				user[i] = (int)(Math.random()*45 + 1 )
					if(lotto[i]==lotto[j]) {
						i--;                          //중복된 번호가 있으면 이전 for문으로 돌아가기
						break;
					}
		}
		}
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45 + 1 );     //1~45까지의 난수 7개 생성
			
			for(int j = 0; j < i; j++) {
				if(lotto[i]==lotto[j]) {
					i--;                          //중복된 번호가 있으면 이전 for문으로 돌아가기
					break;
				}
			}
		}
		
		if(userNum[i] == lotto[i]) {
			for(int i = 0; i < 6; i++) {
				System.out.println("1등입니다.");
				matchCnt++;
			}
		}
		

	}

	// 몇 등인지 출력

}
