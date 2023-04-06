package chap20_lambda.clazz;

public class UserCharString {

	private String str;
	
	//생성자
	public UserCharString(String str) {
		this.str = str;
	}

	//getter setter
	public String getStr() {
		return str;
	}



	public void setStr(String str) {
		this.str = str;
	}
	
	@Override
	public String toString() {
		return "UserCharString [str=" + str + "]";
	}
	
	
	//함수형 인터페이스를 매개변수로 갖는 메소드가 호출되는 부분에서
	//함수형 인터페이스를 람다식으로 구현한다.
	public void changeStr(char ch, UserChar uc) {		//함수형 인터페이스의 UserChar에 있는 findUserChar 불러오기 
		
		this.str = uc.findUserChar(ch, this.str);
		
	}
	
}
