package chap20_lambda;

import chap20_lambda.clazz.Convertor;
import chap20_lambda.clazz.MoneyConvertor;

public class _05_referenceMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		action(MoneyConvertor :: convert);		//클래스명 :: 메소드명1
		
		MoneyConvertor mcv = new MoneyConvertor();		//일반 메소드 참조. 클래스 타입의 참조변수 = 인스턴스화();
											
		action(mcv :: instanceConvert);  	//참조변수명 :: 메소드명2
		
	}

	
	public static void action(Convertor con) {
		int result = con.conv(1000000, '$');
		System.out.println("반환된 돈 : $ " + result);
	}
}
