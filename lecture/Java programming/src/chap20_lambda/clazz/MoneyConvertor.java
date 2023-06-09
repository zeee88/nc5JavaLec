package chap20_lambda.clazz;


public class MoneyConvertor {
	public static int convert(int money, char c) {		//static 메소드
		int convertMoney = 0;
		
		switch(c) {
		case '$' :
			convertMoney = money / 1300;
			break;
		case '\\' :
			convertMoney = money * 1300;
			break;
		default:
			convertMoney = -1;
			break;
		}
		
		return convertMoney;
	}
	
	
	public int instanceConvert(int money, char c) {		//일반 메소드
		int convertMoney = 0;
		
		switch(c) {
		case '$' :
			convertMoney = money / 1500;
			break;
		case '\\' :
			convertMoney = money * 1500;
			break;
		default:
			convertMoney = -1;
			break;
		}
		
		return convertMoney;
	}
	

}
